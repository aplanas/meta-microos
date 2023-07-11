SUMMARY = "Library for SSA/ASS-formatted subtitle rendering"
DESCRIPTION = "libass is a subtitle renderer for the ASS/SSA \
(Advanced Substation Alpha/Substation Alpha) subtitle \
format. It is mostly compatible with VSFilter."
LICENSE = "ISC"

PV = "0.17.1"

RPM_NAME = "libass9-0.17.1-1.3.aarch64.rpm"
RPM_HASH = "c1e780aa8b4b0f8ae677fca1230fe1504c91b65135317c7ba9d7bdbdd290f17b013a3578f3e2fcbfd1c8fcd402b20e73ca7a57b18e0e6f91d47731c2208903f8"

RPROVIDES:${PN} += "libass.so.9 \
libass9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libharfbuzz.so.0 \
libm.so.6"

inherit rpm
