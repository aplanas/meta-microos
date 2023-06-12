SUMMARY = "A library for stubbing in Python"
DESCRIPTION = "Pretend is a library to make stubbing with Python easier."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python311-pretend-1.0.9-3.1.noarch.rpm"
RPM_HASH = "279562f067b97cb219d0d2a78a7d23583d296df709ce1d767fe47daf7480a592fd837645b611ce76d8afee87e6aa52d5b29209cb36ef981b92e08318ebac1427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pretend) \
python311-pretend \
python3dist(pretend)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
