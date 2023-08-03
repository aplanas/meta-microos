SUMMARY = "Development files for Audacious"
DESCRIPTION = "Development files for Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "audacious-devel-4.3.1-2.1.aarch64.rpm"
RPM_HASH = "9a54148fd2282168e3ceacb738e84d76d66c7272e956ef9bb1be7ec3717dd095c12a496f6c5e28688d1a7139ac1fd3dc8094342f9c856dc4a4df4bede4cc4965"

RPROVIDES:${PN} += "audacious-devel \
pkgconfig-audacious"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaudcore5 \
libaudgui5 \
libaudqt2 \
libaudtag3"

inherit rpm
