SUMMARY = "Examples for python311-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-doc-6.5.0-1.2.noarch.rpm"
RPM_HASH = "2aa52f676ba2048608cef2485306e04c98f7ea607a5db07c0ac04212bcf5cfa7398e20198d3d9e10db2ecccce3001c4ce6912122cd66ed853423f6a599e6e244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-PyQt6-doc \
python311-qt6-doc"

RDEPENDS:${PN} += ""

inherit rpm
