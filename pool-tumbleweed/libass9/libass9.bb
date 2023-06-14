SUMMARY = "Library for SSA/ASS-formatted subtitle rendering"
DESCRIPTION = "libass is a subtitle renderer for the ASS/SSA \
(Advanced Substation Alpha/Substation Alpha) subtitle \
format. It is mostly compatible with VSFilter."
LICENSE = "ISC"

PV = "0.17.1"

RPM_NAME = "libass9-0.17.1-1.2.aarch64.rpm"
RPM_HASH = "77fd996cf3d370456d4cc2d54e2b3a9bd37812159135da8d402256c4b4e0689e57548f53f95b28778b653bf97c31b6a34f2b2a882170a53e4cad6ac50bf5af25"

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
