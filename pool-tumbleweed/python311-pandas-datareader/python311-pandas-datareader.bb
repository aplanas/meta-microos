SUMMARY = "Data readers extracted from the pandas codebase"
DESCRIPTION = "Remote data access for pandas. Works for multiple versions of pandas."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python311-pandas-datareader-0.10.0-1.6.noarch.rpm"
RPM_HASH = "f2732846e9a41f8a8ccf3d1745826dc42e1b88283de937810c97b737e7ecb219a0a080b5a6c96b3869f31871ffec9a1442bc0c53d5f69cc1b7a27a77571a172d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-datareader \
python3.11dist-pandas-datareader \
python311-pandas-datareader \
python3dist-pandas-datareader"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-pandas \
python311-requests"

inherit rpm
