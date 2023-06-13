SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-curses-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "08d512c206a933ef7cd097f52af911a1185c6a5d81b1d65790702d69dd722cc73dd244294f4c2ff69367f14a38709b5d7413012c9db88b6d3f6c70ee8ef91a1b"

RPROVIDES:${PN} += "pyth_cur \
python-curses \
python-curses(aarch-64) \
python2-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libpanelw.so.6()(64bit) \
libpython2.7.so.1.0()(64bit) \
libtinfo.so.6()(64bit) \
python-base"

inherit rpm
