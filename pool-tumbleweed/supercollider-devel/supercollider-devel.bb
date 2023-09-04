SUMMARY = "Development files for SuperCollider"
DESCRIPTION = "This package includes include files and libraries neede to develop \
SuperCollider applications"
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-devel-3.13.0-1.4.aarch64.rpm"
RPM_HASH = "e86de00929236346fbff96d3d67252cfd79041e7e9f03423e7e60064d69f3a3d3ebfae4a1e40c4715e189174a985014507f2228a4c9a5de3fa61074cf68bcffb"

RPROVIDES:${PN} += "supercollider-devel"

RDEPENDS:${PN} += "alsa-devel \
avahi-devel \
libjack-devel \
libsndfile-devel \
libudev-devel \
pkgconfig \
supercollider"

inherit rpm
