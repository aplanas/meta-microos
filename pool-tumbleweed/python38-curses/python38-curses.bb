SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.8.18"

RPM_NAME = "python38-curses-3.8.18-1.1.aarch64.rpm"
RPM_HASH = "5e7fd9ced4a34caca15276683bf1da2ed291608f8a6c948064ba521baaff121b2625906e3036c291032c66e54a6cb2176d1dcb20e18430e0cbd5da59c8096c3f"

RPROVIDES:${PN} += "python38-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python38"

inherit rpm
