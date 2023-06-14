SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.10.11"

RPM_NAME = "python310-curses-3.10.11-1.1.aarch64.rpm"
RPM_HASH = "989f5717de0ed77ebdb97e392dcce81bc26314d7552268c0eb4edd673b726702604ac8caaaebbbd3dd64251d4d37a739e0b146d9d50e76a9c2ffed39cd45d8a7"

RPROVIDES:${PN} += "python3-curses \
python310-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python310"

inherit rpm
