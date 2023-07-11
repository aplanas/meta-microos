SUMMARY = "Library which provides basic support for uncompressed multimedia data"
DESCRIPTION = "Gavl is short for Gmerlin Audio Video Library. It is a low level library, upon \
which multimedia APIs can be built. Gavl handles all the details of audio and \
video formats like colorspaces, samplerates, multichannel configurations etc. It \
provides standardized definitions for those formats as well as container \
structures for carrying audio samples or video images inside an application. \
 \
In addition, it handles the sometimes ugly task to convert between all these \
formats and provides some elementary operations (copying, scaling, alpha \
blending etc)."
LICENSE = "GPL-3.0+"

PV = "1.4.0rsvn4256"

RPM_NAME = "libgavl-devel-1.4.0rsvn4256-2.31.aarch64.rpm"
RPM_HASH = "b4cec64b6802a1c8acd38d31f2ac9ff40d77dbcb63448c731f68bafd0d23ddb4dcf032e484972df127bf547be33a93a727b5fe8a57d5e5b7523d47360d4193aa"

RPROVIDES:${PN} += "libgavl-devel \
pkgconfig-gavl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgavl1"

inherit rpm
