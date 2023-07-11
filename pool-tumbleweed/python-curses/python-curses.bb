SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-curses-2.7.18-36.1.aarch64.rpm"
RPM_HASH = "424bac981d6854c1dbd37f71accc896233a5940cf30d4b7fa62745793a01bcb4775cc277d3dd6e68bb024ed9bdc07f76e642f7229c48bb995933da3099c1dade"

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
