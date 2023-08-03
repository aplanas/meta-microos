SUMMARY = "Data files for Rivet"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
 \
This package provides common data files for Rivet used by both C++ \
and Python bindings."
LICENSE = "GPL-2.0-only"

PV = "3.1.8"

RPM_NAME = "Rivet-data-3.1.8-1.1.noarch.rpm"
RPM_HASH = "be0b92d268abd83dea999386686739a143a587a5c895ca9dc21c7b169cdde5ddbe9088061ba2c3d21d91f579d4a4787f3c9d25d6a319042ced86622b99069216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Rivet-data"

RDEPENDS:${PN} += ""

inherit rpm
