SUMMARY = "QtAV development files"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains the header development files for building some QtAV \
applications using QtAV headers."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "QtAV-devel-1.13.0-3.27.aarch64.rpm"
RPM_HASH = "98f10fa14333fffe9e0670a8acbf4aca863589929b50e6f3d2240d590b98635ea1754e91ca6849c95904f40693eea496d9f0f32fcdcbfae34dc83fcba09132d3"

RPROVIDES:${PN} += "QtAV-devel"

RDEPENDS:${PN} += "libQt5OpenGL-devel \
libQtAVWidgets1"

inherit rpm
