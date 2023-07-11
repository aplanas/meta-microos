SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.12.0b3"

RPM_NAME = "python312-curses-3.12.0b3-1.1.aarch64.rpm"
RPM_HASH = "b433609c397f79825196eedff6c1a62996d2fb7166ec979b3c56c84ec4fb33676042c52cc143b13d5a10184c852a8206d5904bd21cb7aba4394deafdcd5587f3"

RPROVIDES:${PN} += "python312-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
python-abi \
python312"

inherit rpm
