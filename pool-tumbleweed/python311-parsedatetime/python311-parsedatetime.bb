SUMMARY = "Python module to parse human-readable date/time text"
DESCRIPTION = "A Python module to parse human-readable date/time strings."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "python311-parsedatetime-2.6-3.3.noarch.rpm"
RPM_HASH = "fcbbffc05d458b1fc25b78980ef0617e44d1cfdf4e73618157714f1fb609102017867d99d97db08cb3113f2478798c51424399185952cd751f982abea9f00b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsedatetime \
python3.11dist-parsedatetime \
python311-parsedatetime \
python3dist-parsedatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
