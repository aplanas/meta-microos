SUMMARY = "Tray icon for launching NVIDIA Settings"
DESCRIPTION = "Little NVIDIA tray icon. \
Hover over it and it will tell you your GPU temperature if your card is into that kind of thing. \
A double click will launch the NVIDIA settings control panel, and right click will bring up a nifty menu with a few options. \
Also on the menu it will show the NVIDIA driver version, which is surely to come in handy at least one time in your life."
LICENSE = "BSD-3-Clause"

PV = "1.02"

RPM_NAME = "nvdock-1.02-14.14.aarch64.rpm"
RPM_HASH = "f6c426a816d3fff96cc069d1fa3713e2a8e1b3647db2f5922780a2806143048514362bbd67c0305336f7fb09ca5549462ecad2182fcfd984d210b61eb161c8c0"

RPROVIDES:${PN} += "nvdock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
