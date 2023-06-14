SUMMARY = "An automatic X screen-locker/screen-saver"
DESCRIPTION = "Xautolock monitors console activity under the X window system, and fires up a \
program of your choice if nothing happens during a user configurable period of \
time. You can use this to automatically start up a screen locker in case you \
tend to forget to do so manually before having a coffee break."
LICENSE = "GPL-2.0"

PV = "2.2"

RPM_NAME = "xautolock-2.2-2.22.aarch64.rpm"
RPM_HASH = "6a385306d4008ad9ce206f19b67b6d5bae97c27c27799de5f69ef224a5bb1caad0f0712771dd96b3b71af9bbe618f85e9361e958acd7918058180320a2d4b757"

RPROVIDES:${PN} += "xautolck \
xautolock"

RDEPENDS:${PN} += "libX11.so.6 \
libXss.so.1 \
libc.so.6"

inherit rpm
