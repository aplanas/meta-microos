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

RPM_NAME = "gavl-1.4.0rsvn4256-2.30.aarch64.rpm"
RPM_HASH = "09146189a82f793b00b7984e74a3dcda3fca9dfc55264bdf228caf421c05c14d48b5533040c2b1a14e404b04ba24083ed6156e9fca5e3037ffc50725a0aaf513"

RPROVIDES:${PN} += "gavl \
gavl(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgavl.so.1()(64bit)"

inherit rpm
