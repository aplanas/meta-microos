SUMMARY = "I3 Status Bar"
DESCRIPTION = "i3status is a program for generating a status bar for i3bar, dzen2, \
xmobar or similar programs. It issues a small number of system \
calls, as one generally wants to update such status lines every \
second so that the bar is updated even under load. It saves a bit of \
energy by being more efficient than shell commands."
LICENSE = "BSD-3-Clause"

PV = "2.13"

RPM_NAME = "i3status-2.13-1.16.aarch64.rpm"
RPM_HASH = "ccc6240c6aae8c6d608aab4704cee215307028e6259dfbad216d0e10a66bcc797972b4b959a6d487d933a07df86c5ed57429678f8df3fc968162e11fdbd24772"

RPROVIDES:${PN} += "config-i3status \
i3status"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libconfuse.so.2 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpulse.so.0 \
libyajl.so.2"

inherit rpm
