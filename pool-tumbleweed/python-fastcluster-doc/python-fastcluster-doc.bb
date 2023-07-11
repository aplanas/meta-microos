SUMMARY = "Documentation for python-fastcluster"
DESCRIPTION = "Documentation and help files for python-fastcluster."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python-fastcluster-doc-1.2.6-1.7.aarch64.rpm"
RPM_HASH = "bb57ef2c0b6e1c3a08cef13712f76ada2bb43001d3f197a18f078cad7322179ace8f68b37a6a9700527a35fcbc15dbc81746e0653da9fde2e359f42dccd83bc9"

RPROVIDES:${PN} += "python-fastcluster-doc \
python310-fastcluster-doc \
python311-fastcluster-doc \
python39-fastcluster-doc"

RDEPENDS:${PN} += ""

inherit rpm
