SUMMARY = "Retrying library for Python"
DESCRIPTION = "Retrying is a general-purpose retrying library, written in Python, to \
simplify the task of adding retry behavior to just about anything."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "python310-retrying-1.3.4-1.5.noarch.rpm"
RPM_HASH = "a27d4373ac4041115f8956dd18834bbe8008283cf22451e5b51733fc347f71d83f341b5b32e6c6ef8a4b938d6c6bb2f85ddb0a6200fcc418e1e2ba2c4192b637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-retrying \
python310-retrying \
python3dist-retrying"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
