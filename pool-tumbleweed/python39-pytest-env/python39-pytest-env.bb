SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python39-pytest-env-0.8.1-1.3.noarch.rpm"
RPM_HASH = "24e666374568cbe73dc59a61d3d8aeebaa41363ba7239d4acb0c97454a4a08676c44a08f45175c4d3f54609b68c1350baf2f4e5389019139a1198d0c9e25a634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-env \
python39-pytest-env \
python3dist-pytest-env"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
