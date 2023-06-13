SUMMARY = "Documentation for python3-tvtk"
DESCRIPTION = "Documentation files for the python3-tvtk package."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "4.7.4"

RPM_NAME = "python3-tvtk-doc-4.7.4-1.7.aarch64.rpm"
RPM_HASH = "51c9a643c1802174d7117362fdefb8de406c7dca3ad43c07392ee699a84993f6f5ff30dabcefeb27463fcd8c021fdf1d31987f01cd317c622c7d3c1cf34b3cc8"

RPROVIDES:${PN} += "python3-tvtk-doc \
python3-tvtk-doc(aarch-64)"

RDEPENDS:${PN} += "python3-tvtk"

inherit rpm
