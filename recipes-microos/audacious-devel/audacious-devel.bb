SUMMARY = "Development files for Audacious"
DESCRIPTION = "Development files for Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "audacious-devel-4.3-1.3.aarch64.rpm"
RPM_HASH = "dc00fcc0d11f24742c3a0a0c8c9666f35d4a7b7e2075ee42b5699598c92a8417317bb42b013b035b9cb78b52cdd5e77ec61354caa62f19f54acb02bb4638fd28"

RPROVIDES:${PN} += "audacious-devel audacious-devel(aarch-64) pkgconfig(audacious)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libaudcore5 libaudgui5 libaudqt2 libaudtag3"

inherit rpm
