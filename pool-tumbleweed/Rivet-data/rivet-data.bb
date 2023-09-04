SUMMARY = "Data files for Rivet"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
 \
This package provides common data files for Rivet used by both C++ \
and Python bindings."
LICENSE = "GPL-2.0-only"

PV = "3.1.8"

RPM_NAME = "Rivet-data-3.1.8-1.2.noarch.rpm"
RPM_HASH = "76b361c6cd7f82697bb528aecb18e22c4ac0bcbcb66305f5b46d00229cca9a59953a6cdea0d419efb889ac69d93cca94867a2cf139c6258db35c0afed04a4ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Rivet-data"

RDEPENDS:${PN} += ""

inherit rpm
