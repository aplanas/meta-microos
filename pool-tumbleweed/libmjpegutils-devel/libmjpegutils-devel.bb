SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "This package contains all files needed to develop code that uses the \
mjpegtools libraries."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmjpegutils-devel-2.2.1-2.6.aarch64.rpm"
RPM_HASH = "2e27ed1eee0c535962f1fe9cd17130ba79fca71d6cc6ec793d62cd6890817dd54e1b2f0f6a5ff9c42f09460388f1a383b669b54b8106da3d09109f3bfc817e9a"

RPROVIDES:${PN} += "libmjpegutils-devel \
mjpegtools-devel \
pkgconfig-mjpegtools"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblavfile-2-2-0 \
liblavjpeg-2-2-0 \
liblavplay-2-2-0 \
liblavrec-2-2-0 \
libmjpegutils-2-2-0 \
libmpeg2encpp-2-2-0 \
libmplex2-2-2-0"

inherit rpm
