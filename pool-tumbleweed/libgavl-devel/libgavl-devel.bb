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

RPM_NAME = "libgavl-devel-1.4.0rsvn4256-2.30.aarch64.rpm"
RPM_HASH = "3f455b49b0323c38f28040630097b269d099ca44075a36fce6ae001eb8c721c18878ed5078af5cf3d7ebba5489ca0d2416820101f4a1bd4bf792920a3b0cbbb6"

RPROVIDES:${PN} += "libgavl-devel \
pkgconfig-gavl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgavl1"

inherit rpm
