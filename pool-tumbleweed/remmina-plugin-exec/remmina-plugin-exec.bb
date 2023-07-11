SUMMARY = "Plugin for Remmina to allow execution of local commands"
DESCRIPTION = "This package provides a plugin for Remmina allowing the execution of \
local commands."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-plugin-exec-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "0bec2c3830ba52c8b73abe7241074adf3d252a58e6f757fef941154326a5353fc94ee5394c472bb25873c652a2c0253bb4fa2c2c5b844f2731a7e1f9226a15e5"

RPROVIDES:${PN} += "remmina-plugin-exec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
remmina"

inherit rpm
