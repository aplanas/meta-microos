SUMMARY = "A rewrite of unclutter using the x11-xfixes extension"
DESCRIPTION = "This is a rewrite of the popular tool unclutter, but using the x11-xfixes \
extension. This means that this rewrite doesn't use fake windows or pointer \
grabbing and hence causes less problems with window managers and/or applications."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "unclutter-xfixes-1.6-1.1.aarch64.rpm"
RPM_HASH = "89c4975ad70b574a3be4cce6c8dea2d2934bfe1d1bdfd867f8c1536d7ee9457b33e6a0f9b55df410dc45f07d928569316a8bc75b62fc46b96fc0ef2be5ee816f"

RPROVIDES:${PN} += "unclutter-xfixes"

RDEPENDS:${PN} += "libX11.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libc.so.6 \
libev.so.4"

inherit rpm
