SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.12.0rc1"

RPM_NAME = "python312-curses-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "b8da0821206edb058698e0c4e427dc13d995a0134cf24b220904b2bf62e0987c00d683b96099ce12f4676d329081686249981913b53fb98e5407f1505077718c"

RPROVIDES:${PN} += "python312-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
python-abi \
python312"

inherit rpm
