SUMMARY = "A Set of Libraries for Integration with SCAP"
DESCRIPTION = "OpenSCAP is a set of open source libraries providing an easier path for \
integration of the SCAP line of standards. \
 \
SCAP is a line of standards managed by NIST with the goal of providing \
a standard language for the expression of Computer Network Defense \
related information. \
 \
More information about SCAP can be found at nvd.nist.gov."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "openscap-1.3.8-1.1.aarch64.rpm"
RPM_HASH = "120ad17f6b1b0e9a44774559bc3d57f936d3f91d7982d90a80b77a58fa5579021aae7947f79f0328657d4c06f41cafb2dce871b944d2cdbad88ccbd9ab7d2803"

RPROVIDES:${PN} += "openscap"

RDEPENDS:${PN} += ""

inherit rpm
