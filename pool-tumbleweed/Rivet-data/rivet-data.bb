SUMMARY = "Data files for Rivet"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
 \
This package provides common data files for Rivet used by both C++ \
and Python bindings."
LICENSE = "GPL-2.0-only & Apache-2.0 & MPL-2.0 & LPPL-1.3a & BSL-1.0"

PV = "3.1.8"

RPM_NAME = "Rivet-data-3.1.8-2.1.noarch.rpm"
RPM_HASH = "19cfe029ddcd88b7d52e1bf36ea5a5e116ffefbb54832db97b79db75b1338f27b9f6afcc17b9a04f768ffdf3f7c1c1d7cfb04d6c8d8c7c932d57bd7e63e3281a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Rivet-data"

RDEPENDS:${PN} += ""

inherit rpm
