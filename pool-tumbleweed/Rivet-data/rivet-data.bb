SUMMARY = "Data files for Rivet"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
 \
This package provides common data files for Rivet used by both C++ \
and Python bindings."
LICENSE = "GPL-2.0-only"

PV = "3.1.7"

RPM_NAME = "Rivet-data-3.1.7-1.1.noarch.rpm"
RPM_HASH = "29c35dc9f948bc818618b26549c6a98655c1c44d6b34acd401c5d62a1e69c1f9e0ada27f5f1db0479f67ced6c4e6a03d886555ec281ec4b4846667255229d1ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Rivet-data"
RDEPENDS:${PN} += ""

inherit rpm
