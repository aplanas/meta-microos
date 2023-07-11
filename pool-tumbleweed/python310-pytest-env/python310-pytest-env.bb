SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python310-pytest-env-0.8.1-1.3.noarch.rpm"
RPM_HASH = "e2137676a997146818af38832373091963d0aaf76ebf8cf1bb1b069659db97422b9c3839df401474f233cc564b54d4673bd84e00c8b083cc1c78f60099c3c7d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-env \
python310-pytest-env \
python3dist-pytest-env"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
