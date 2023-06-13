SUMMARY = "Data readers extracted from the pandas codebase"
DESCRIPTION = "Remote data access for pandas. Works for multiple versions of pandas."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python311-pandas-datareader-0.10.0-1.4.noarch.rpm"
RPM_HASH = "49afd24235a5c7c375751ec5b4d2102b35383fe42fb2595ff9203c646be605cd64fc5705ec0011e97ea82f77cf5fa82dc3937c6b5db70119594164593218e71e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pandas-datareader) \
python311-pandas-datareader \
python3dist(pandas-datareader)"

RDEPENDS:${PN} += "python(abi) \
python311-lxml \
python311-pandas \
python311-requests"

inherit rpm
