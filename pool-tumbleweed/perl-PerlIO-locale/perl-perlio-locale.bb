SUMMARY = "PerlIO layer to use the encoding of the current locale"
DESCRIPTION = "This is mostly a per-filehandle version of the 'open' pragma, when used \
under the form \
 \
    use open ':locale'; \
 \
The encoding for the opened file will be set to the encoding corresponding \
to the locale currently in effect, if perl can guess it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-PerlIO-locale-0.10-1.36.aarch64.rpm"
RPM_HASH = "989074448f29f194b61d0898fedde2ef58188244e2174300b886f35afaf597627fbbd26ebd81d6eb161f3e75a6f5ff766a4e9b13fed2730d4fd89daa031f92bb"

RPROVIDES:${PN} += "perl-PerlIO--locale \
perl-PerlIO-locale"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
