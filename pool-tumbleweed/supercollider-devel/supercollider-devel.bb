SUMMARY = "Development files for SuperCollider"
DESCRIPTION = "This package includes include files and libraries neede to develop \
SuperCollider applications"
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-devel-3.13.0-1.3.aarch64.rpm"
RPM_HASH = "406f8fc6aee054ae96f6dde6ebcc1180d77a10593648f3c1cd8ae3bae1e83be351785db542b757483308e7f58157c26162b67466c5f48abe70401e99c0715c2a"

RPROVIDES:${PN} += "supercollider-devel"

RDEPENDS:${PN} += "alsa-devel \
avahi-devel \
libjack-devel \
libsndfile-devel \
libudev-devel \
pkgconfig \
supercollider"

inherit rpm
