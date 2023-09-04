SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-curses-2.7.18-37.1.aarch64.rpm"
RPM_HASH = "3a68516200246d6fa8efd5e6695778cd3efdc03901e8a1035fde68f54721bc238e06623639546187215a77473d65adc0b1becc3ef0f8b5684a8288fb206d4689"

RPROVIDES:${PN} += "pyth-cur \
python-curses \
python2-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libpython2.7.so.1.0 \
libtinfo.so.6 \
python-base"

inherit rpm
