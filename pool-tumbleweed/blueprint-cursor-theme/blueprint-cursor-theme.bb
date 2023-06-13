SUMMARY = "X Window System Cursors for the Blue Print Theme"
DESCRIPTION = "A nice mouse cursor theme for the X Window System."
LICENSE = "GPL-2.0+"

PV = "0.0.2"

RPM_NAME = "blueprint-cursor-theme-0.0.2-271.17.noarch.rpm"
RPM_HASH = "a31263dd8e999ad886544a4f903a37587be3d3fb241ee899ff9ca62d88341b3216b53113ce7e9102b9f1c185cc093a35c92cb3d8212982cace68953a9175640c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blueprint-cursor-theme"

RDEPENDS:${PN} += ""

inherit rpm
