SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.12.0b1"

RPM_NAME = "python312-curses-3.12.0b1-1.1.aarch64.rpm"
RPM_HASH = "6c42d04f926357e859ba01df5b8e9602582fb9be21b582e7a558b6312a7d5b3ecce99a6c375b9820a6c03f5b7248d244c932e18d81ee2d83a4f970d7539cee1a"

RPROVIDES:${PN} += "python312-curses \
python312-curses(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libncursesw.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
python(abi) \
python312"

inherit rpm
