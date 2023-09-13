SUMMARY = "Graphical viewer for GNU ddrescue mapfiles"
DESCRIPTION = "This small tool allows the user to graphically examine ddrescue's map files in a user friendly GUI application. The Main window displays a block grid with each block's color representing the block types it contains. Many people know this type of view from defragmentation programs."
LICENSE = "GPL-3.0-only"

PV = "0.4.5"

RPM_NAME = "ddrescueview-0.4.5-2.1.aarch64.rpm"
RPM_HASH = "e620d69a27d15087495ba90bd498d65ef25428efac5e5605ed2d532b0a8b36f04fbe9fe565a55c5dae2599cd9633067d9ede59a2426db2464f99d5705e4a8675"

RPROVIDES:${PN} += "ddrescueview"

RDEPENDS:${PN} += "libQt5Pas.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
