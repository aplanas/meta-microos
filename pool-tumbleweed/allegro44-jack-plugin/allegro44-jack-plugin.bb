SUMMARY = "Allegro JACK (Jack Audio Connection Kit) plugin"
DESCRIPTION = "This package contains a plugin for Allegro which enables Allegro to playback \
sound through JACK (Jack Audio Connection Kit)."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-jack-plugin-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "24d8eefd024d635e88576721a06ab46221c70bced715129910add9f1b60beca66a2c32455b81297f238a3f92abb690dd316279f7b2ef3538750ef89891c14468"

RPROVIDES:${PN} += "allegro44-jack-plugin"

RDEPENDS:${PN} += "allegro44 \
ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libjack.so.0"

inherit rpm
