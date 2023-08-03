SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python311-pytest-env-0.8.2-1.1.noarch.rpm"
RPM_HASH = "8c731c272c50d9d7ebd831973ec591f1e968bf243a158d1f4ee8931b2a9643132fc644e98259ad12e3e28eee3b4ee70e0cb2ffafbb70bd5edf18dcf86d5488d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-env \
python3.11dist-pytest-env \
python311-pytest-env \
python3dist-pytest-env"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
