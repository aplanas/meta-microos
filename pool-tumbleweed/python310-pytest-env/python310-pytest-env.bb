SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python310-pytest-env-0.8.1-1.1.noarch.rpm"
RPM_HASH = "f03d9fda1cf5d530c60d7fa70cc481f976af5b77c4d12f1085350fe976ff66a1dde2f9e3b503796a687a8adb29f0393ae9b22d917ec6bf2e4e5a51c9bd62f2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-env \
python3.10dist-pytest-env \
python310-pytest-env \
python3dist-pytest-env"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
