SUMMARY = "Command-line client to control cdemu-daemon"
DESCRIPTION = "cdemu-client is a command-line client for controlling cdemu-daemon. \
 \
It provides a way to perform the key tasks related to controlling the \
CDEmu daemon, such as loading and unloading devices, displaying \
devices' status and retrieving/setting their debug masks."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "cdemu-client-3.2.5-1.6.noarch.rpm"
RPM_HASH = "c1634172316ce6737f896f25d9f6acee9d91608139caa3fdb0b4d56fde32e105b4fcdd165f4f73a91381d516c6260f31557c563a2df611480a9dbd7d1ca2b6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(cdemu-client.desktop) cdemu-client mimehandler(application/x-apple-diskimage) mimehandler(application/x-b6t) mimehandler(application/x-c2d) mimehandler(application/x-ccd) mimehandler(application/x-cd-image) mimehandler(application/x-cdi) mimehandler(application/x-cdrdao-toc) mimehandler(application/x-cif) mimehandler(application/x-cso) mimehandler(application/x-cue) mimehandler(application/x-daa) mimehandler(application/x-ecm) mimehandler(application/x-gamecube-iso-image) mimehandler(application/x-gbi) mimehandler(application/x-isz) mimehandler(application/x-macbinary) mimehandler(application/x-mds) mimehandler(application/x-mdx) mimehandler(application/x-nrg) mimehandler(application/x-wii-iso-image) mimehandler(application/x-xcdroast) mimehandler(application/x-xmd)"
RDEPENDS:${PN} += "/usr/bin/python3 python3 python3-dbus-python python3-gobject typelib(GLib) typelib(Gio)"

inherit rpm
