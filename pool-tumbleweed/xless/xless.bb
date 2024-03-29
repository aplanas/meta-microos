SUMMARY = "Text browser"
DESCRIPTION = "xless 1.7 -- the well-known text browser. Necessary for displaying the \
various HOWTOs."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "xless-1.7-1258.9.aarch64.rpm"
RPM_HASH = "fb12adea2c863324dba4304d3119dec801b920aaa0e3737761f816d6b4c91e259787835f00099553013e39116db6774e9062b3605c50de48e7817ef7e0cf5a40"

RPROVIDES:${PN} += "config-xless \
xless \
xless17"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
