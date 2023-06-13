SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "This package contains all files needed to develop code that uses the \
mjpegtools libraries."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmjpegutils-devel-2.2.1-2.5.aarch64.rpm"
RPM_HASH = "3c647645aa973ee3365e1b72eb57a7b967e8e1f50b72f735a5c0d44c0ed516443a67e722ee11406cd31b1d28ebe6ab1638c4e8df625e2f0b7eef5a5f15f1d018"

RPROVIDES:${PN} += "libmjpegutils-devel \
libmjpegutils-devel(aarch-64) \
mjpegtools-devel \
pkgconfig(mjpegtools)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblavfile-2_2-0 \
liblavjpeg-2_2-0 \
liblavplay-2_2-0 \
liblavrec-2_2-0 \
libmjpegutils-2_2-0 \
libmpeg2encpp-2_2-0 \
libmplex2-2_2-0"

inherit rpm
