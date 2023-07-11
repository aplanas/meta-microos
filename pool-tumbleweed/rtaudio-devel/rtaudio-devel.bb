SUMMARY = "Development files for rtaudio"
DESCRIPTION = "RtAudio is a set of C++ classes that provide a common API for \
realtime audio input/output across different operating systems. \
 \
This subpackage contains the headers for rtaudio."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "rtaudio-devel-5.1.0-1.16.aarch64.rpm"
RPM_HASH = "4061cf652de922cd5dfac9c5b0f65f03f18989b9b31645dc543087327bf9e57a2243aea70269e3288ef78226d8786dec9920a1714eeeb7b02278e260b1e19ddb"

RPROVIDES:${PN} += "pkgconfig-rtaudio \
rtaudio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librtaudio6 \
pkgconfig-alsa \
pkgconfig-jack \
pkgconfig-libpulse-simple"

inherit rpm
