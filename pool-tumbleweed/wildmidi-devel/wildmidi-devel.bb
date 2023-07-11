SUMMARY = "Development files for wildmidi"
DESCRIPTION = "The wildmidi-devel package contains libraries and header files for \
developing applications that use wildmidi."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.5"

RPM_NAME = "wildmidi-devel-0.4.5-1.4.aarch64.rpm"
RPM_HASH = "ec9424f3e40998f8208e154050aef1536833fc6ba1b6a0ae01fbd9da96d7364df97c22dc58e4be77318f89331b2d2af47cdfd7c765cb5ebdf886647ca41be95c"

RPROVIDES:${PN} += "cmake-WildMidi \
pkgconfig-wildmidi \
wildmidi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libWildMidi2"

inherit rpm
