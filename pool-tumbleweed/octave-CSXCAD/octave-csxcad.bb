SUMMARY = "Octave interface for openEMS"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties. \
 \
This package provides Octave interface for CSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "octave-CSXCAD-0.6.2-3.20.noarch.rpm"
RPM_HASH = "22b0a7a7e8d6f8448b39307894179648399014f4fcb65a89e36894f36413ed5fd5fa00d1643fd33613f2ba2b4bf2bd2f3d129579d8694d98d8aeae1eb477fc79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-CSXCAD"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
