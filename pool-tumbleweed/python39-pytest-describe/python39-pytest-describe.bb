SUMMARY = "Describe-style plugin for pytest"
DESCRIPTION = "Describe-style plugin for pytest."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-pytest-describe-2.1.0-2.1.noarch.rpm"
RPM_HASH = "9c8b1d7d148d1768c8681c4c6425d9a4f824a156c098ef7766e750ccf643aa0be7b336c9861b9bf14bfc7af6ca4a40fe78dd9c876c10c98b140286cae9281150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-describe \
python39-pytest-describe \
python3dist-pytest-describe"

RDEPENDS:${PN} += "python-abi \
python39-py \
python39-pytest"

inherit rpm
