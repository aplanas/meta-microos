SUMMARY = "Command line tool to interact with an EWMH/NetWM compatible X Window Manager"
DESCRIPTION = "Wmctrl provides command line access to almost all the features defined \
in the EWMH specification. Using it, it's possible to, for example, \
obtain information about the window manager, get a detailed list of \
desktops and managed windows, switch and resize desktops, change number \
of desktops, make windows full-screen, always-above or sticky, and \
activate, close, move, resize, maximize and minimize them. \
 \
The command line access makes it easy to automate these tasks and \
execute them from any application that is able to run a command in \
response to some event. \
 \
Please note that wmctrl only works with window managers which implement \
this specification. \
 \
 \
 \
Authors: \
-------- \
    Tomas Styblo <tripie@cpan.org>"
LICENSE = "GPL-2.0+"

PV = "1.07"

RPM_NAME = "wmctrl-1.07-150.23.aarch64.rpm"
RPM_HASH = "876191522fbbc5dc40ab4cf5676fa37b8375395fb1cb12021425eeb0cb348f05150bf67fe809763a79a9c8182b4deda0c63e6ae5618db0b008b7b314a43f7fe3"

RPROVIDES:${PN} += "wmctrl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
