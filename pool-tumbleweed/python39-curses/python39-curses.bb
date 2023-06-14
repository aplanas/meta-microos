SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-curses-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "18089c0820e0b72cddf214f0b7622b21ba31f1e4a881e5341f507d62b73fba9f53b6bc4ba969c02898294582443c607a341f187626c3b457d81c61c545bd2227"

RPROVIDES:${PN} += "python39-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python39"

inherit rpm
