SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-curses-3.10.12-3.1.aarch64.rpm"
RPM_HASH = "010219b9f633ea87fdb4740b93bd081951302b66224c6c62fd1a612e738832b01b9a7134f90a418cca16a1aae4739b6816dee36225d7183c52b6a67ad1a3b864"

RPROVIDES:${PN} += "python310-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python310"

inherit rpm
