SUMMARY = "Events Grabbing Program for X-Window"
DESCRIPTION = "xbindkeys is a program that associates keys or mouse buttons to shell commands \
under X. After a little configuration, it can start many commands with the \
keyboard (e.g. control+alt+x starts an xterm) or with the mouse buttons. \
 \
 \
guile support is disabled in this package. \
To enable guile support, rebuild the src.rpm and pass --with guile \
to rpmbuild."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.7"

RPM_NAME = "xbindkeys-1.8.7-1.9.aarch64.rpm"
RPM_HASH = "081ff048fb39f4646b49c85bce23a822d0906409e41bdd20d6e3c1a63cee36461162e69061e4cd0264854b970cb3f69fa738ea47fcea36c99547eafaefcb1a21"

RPROVIDES:${PN} += "xbindkeys \
xbindkeys(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
tk"

inherit rpm
