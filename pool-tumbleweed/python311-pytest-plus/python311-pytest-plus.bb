SUMMARY = "Extension for pytest to enforce minimum tests pass"
DESCRIPTION = "PyTest Plus extends pytest functionality to enforce PYTEST_REQPASS tests passed."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-pytest-plus-0.4.0-1.3.noarch.rpm"
RPM_HASH = "c4d96c2924f8561cb51d6db47726eb53cc3c3cbfbd9e6fe8873ef870acfd5056d250190f8e9f3cf1fedefdfe0037adfd11403c144b5ab565373e0db9aa87e347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-plus \
python3.11dist-pytest-plus \
python311-pytest-plus \
python3dist-pytest-plus"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
