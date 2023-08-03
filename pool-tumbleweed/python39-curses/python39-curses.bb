SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-curses-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "cab5d180d39d52d92eb0e7d1c668cdea03f5ae833f191cd2493a91f540226e2af1fae05b4b2db2023312020d9b517fb1a034b546cc98efca714a008ac9e057b3"

RPROVIDES:${PN} += "python39-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python39"

inherit rpm
