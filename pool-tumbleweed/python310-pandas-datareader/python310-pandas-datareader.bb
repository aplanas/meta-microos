SUMMARY = "Data readers extracted from the pandas codebase"
DESCRIPTION = "Remote data access for pandas. Works for multiple versions of pandas."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python310-pandas-datareader-0.10.0-1.6.noarch.rpm"
RPM_HASH = "584b2b415199732625038e180f9fd422635f44186785a7a46d0fc5f41f0bf5885438fbed7444f46f515a6ffb68980a8f376b226c68a29baec3cac34fd9ca4624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pandas-datareader \
python310-pandas-datareader \
python3dist-pandas-datareader"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-pandas \
python310-requests"

inherit rpm
