SUMMARY = "Window Manager with a Taskbar -- Default configuration"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small. \
 \
Configuration files from upstream provider without suse branding"
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.0"

RPM_NAME = "icewm-config-upstream-3.4.0-1.1.noarch.rpm"
RPM_HASH = "ea52be42d213d486f041c58ed6790b28f317cbca11e8d3512ab7342f747d006d9227230e3c863b5ede2e22c9fb3cc2cb08b7a86932bd6616c514f411a1fc1ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-icewm-config-upstream \
icewm-config-upstream \
icewm-configuration-files"

RDEPENDS:${PN} += ""

inherit rpm
