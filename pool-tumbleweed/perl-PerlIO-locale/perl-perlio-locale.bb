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

RPM_NAME = "perl-PerlIO-locale-0.10-1.37.aarch64.rpm"
RPM_HASH = "a0245708b974a0e7b83a5cad410591dc3e7c6c62ea5ec2bbc5a8dd8d20a3c032cb7e22ab5d68beddc75b872cf547f9785c22269a74889e0ae9df7cf0001cbc31"

RPROVIDES:${PN} += "perl-PerlIO--locale \
perl-PerlIO-locale"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
