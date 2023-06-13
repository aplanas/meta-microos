SUMMARY = "Replays VNC macros"
DESCRIPTION = "rfbplaymacro replays VNC macros as created by rfbproxy to a VNC server. \
 \
 \
 \
Authors: \
-------- \
    Tim Waugh <twaugh@redhat.com>"
LICENSE = "GPL-2.0+"

PV = "0.2.2"

RPM_NAME = "rfbplaymacro-0.2.2-51.26.aarch64.rpm"
RPM_HASH = "22e480d56289d20e7987f5b69a018a8bd583de6d69252598b85e2072416c03d64fa028e801d251cc1c808d49faac80ea3b735df175b389859f8b4cabd422bc5a"

RPROVIDES:${PN} += "rfbplaymacro \
rfbplaymacro(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
