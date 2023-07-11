SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-curses-3.8.17-1.1.aarch64.rpm"
RPM_HASH = "40db5309c0b8fa6b012cea53f9c93a969e8af0344a632bfa19ae8c3d74cea24c9a93c718f5d3a2ff0628343efecaf86d9f2755b12daa8f3cb887a8c1f7f6bf30"

RPROVIDES:${PN} += "python38-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python38"

inherit rpm
