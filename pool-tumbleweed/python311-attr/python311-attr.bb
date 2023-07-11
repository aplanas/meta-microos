SUMMARY = "Python module for setting attributes of target functions or classes"
DESCRIPTION = "A decorator to set attributes of target function or class in a DRY way."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-attr-0.3.2-1.5.noarch.rpm"
RPM_HASH = "86bbc0e4d7293d7de04ed26acb81f84f1548f6afa63117c0e31f4b336d90714d06c288c5f7adf900932d9ede6cfa8bd3a4e27af5afbcfc344294a60e640e8f4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-attr \
python3.11dist-attr \
python311-attr \
python3dist-attr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
