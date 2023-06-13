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

RPM_NAME = "perl-PerlIO-locale-0.10-1.35.aarch64.rpm"
RPM_HASH = "56f56d2d63dc447b4f76623fb24f4afa5920d70f1144a66b40e71f155ed7021e80bd3c555fce78954d176290c30d8334f878b7ff8c891e4db47d28d106e1bc56"

RPROVIDES:${PN} += "perl(PerlIO::locale) \
perl-PerlIO-locale \
perl-PerlIO-locale(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
