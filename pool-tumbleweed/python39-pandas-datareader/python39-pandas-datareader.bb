SUMMARY = "Data readers extracted from the pandas codebase"
DESCRIPTION = "Remote data access for pandas. Works for multiple versions of pandas."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python39-pandas-datareader-0.10.0-1.6.noarch.rpm"
RPM_HASH = "1b06cbdcafadb81e8aa4f7b9b324721c84b1202c3a7ac7ce836c0bfd9612e7151ef374aa8846fba8d38968956169f91ddc9988686502870a524ad7bda409ed2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pandas-datareader \
python39-pandas-datareader \
python3dist-pandas-datareader"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-pandas \
python39-requests"

inherit rpm
