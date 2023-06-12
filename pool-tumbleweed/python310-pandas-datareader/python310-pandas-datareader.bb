SUMMARY = "Data readers extracted from the pandas codebase"
DESCRIPTION = "Remote data access for pandas. Works for multiple versions of pandas."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python310-pandas-datareader-0.10.0-1.4.noarch.rpm"
RPM_HASH = "b0fb902f7eca9bb0516831e212da1dddb16d923706815b7b4fc901b9d9282bc70a1c4048d7e59aa0f5b90bb7cd96549c98d730b4dc069622fe73588b33b7e9c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-datareader \
python3.10dist(pandas-datareader) \
python310-pandas-datareader \
python3dist(pandas-datareader)"
RDEPENDS:${PN} += "python(abi) \
python310-lxml \
python310-pandas \
python310-requests"

inherit rpm
