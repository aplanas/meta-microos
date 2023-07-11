SUMMARY = "Graphical viewer for GNU ddrescue mapfiles"
DESCRIPTION = "This small tool allows the user to graphically examine ddrescue's map files in a user friendly GUI application. The Main window displays a block grid with each block's color representing the block types it contains. Many people know this type of view from defragmentation programs."
LICENSE = "GPL-3.0-only"

PV = "0.4.5"

RPM_NAME = "ddrescueview-0.4.5-1.8.aarch64.rpm"
RPM_HASH = "1db1deacf73dffde173942f84273bb732bbb78972658b3a374e353c8db5aca333d23632a06f37a4c38925d660b2392c17d2f82e1ea7d0e3288b73b8e4511c4a0"

RPROVIDES:${PN} += "ddrescueview"

RDEPENDS:${PN} += "libQt5Pas.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
