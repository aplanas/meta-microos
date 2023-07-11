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

RPM_NAME = "gavl-1.4.0rsvn4256-2.31.aarch64.rpm"
RPM_HASH = "5337b003130c8e8f9b058d51d4550aa5357a6e656cfa3013a5a465605315d2865751ba3b105c4203641e1bd1181c2bacb0404abc04d3706da569f2f59d820787"

RPROVIDES:${PN} += "gavl"

RDEPENDS:${PN} += "libc.so.6 \
libgavl.so.1"

inherit rpm
