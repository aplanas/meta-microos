SUMMARY = "Python module to build tested documentation"
DESCRIPTION = "Manuel lets the user build tested documentation. \
 \
Documentation, a full list of included plug-ins, and examples are available \
with the -doc package and at http://packages.python.org/manuel/."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python311-manuel-1.12.4-4.1.noarch.rpm"
RPM_HASH = "6cc2864d984da24b75652a46e755f5da3cc1ee074919e0de992f49533372dfde1d968e47693cbe70d0930620bf8a510ce39c312050688617c4862e929d3bbb96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(manuel) \
python311-manuel \
python3dist(manuel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
