SUMMARY = "Octave interface for openEMS"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties. \
 \
This package provides Octave interface for CSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "octave-CSXCAD-0.6.2-3.19.noarch.rpm"
RPM_HASH = "8b941321614f70c6a25df680244a6cc98c561b28a95a5f140d8fba28adbc9587ce78a6ab74f3c0d19ca187fb41a79865e44c894d490dac6764c7307be01cd353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-CSXCAD"
RDEPENDS:${PN} += "/bin/sh \
octave-cli"

inherit rpm
