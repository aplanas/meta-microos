SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.10.13"

RPM_NAME = "python310-curses-3.10.13-1.1.aarch64.rpm"
RPM_HASH = "13151d85e554be9b0005ca5dd3483834c301f636d590904c1ea7b7535e85b650cf8fff81f16fed269bbec4af3aa99f04e8264e57b5881470559c18ddeb6ed27a"

RPROVIDES:${PN} += "python310-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python310"

inherit rpm
