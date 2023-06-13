SUMMARY = "Manipulate the XSelection"
DESCRIPTION = "With this little tool, pipe the currently selected text under X into a \
file or vice versa. \
 \
Help can be found by reading the man page with \
 \
man xselection"
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "xselection-1.6.1-813.24.aarch64.rpm"
RPM_HASH = "6f92e5dc9c5b3b855fb182627918829a51eab9c4a827beb911b51dec4494ca2386c4881d24cfa0221ff5dcb316d8c1ffbe2b03845585624fdd19c2b362a0aff3"

RPROVIDES:${PN} += "xselect \
xselection \
xselection(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
