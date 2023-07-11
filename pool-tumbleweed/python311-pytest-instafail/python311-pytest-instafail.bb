SUMMARY = "Pytest Plugin to Show Failures Instantly"
DESCRIPTION = "Pytest-instafail is a plugin for py.test that shows \
failures and errors instantly instead of waiting \
until the end of test session."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python311-pytest-instafail-0.5.0-1.3.noarch.rpm"
RPM_HASH = "244be1aae2d199d25bf8acbae8c44f2752d8cd5fae2fc8c6b6715544800a59bfcd49d641ff3ac65f00d4eb300429d825e337c60296b4a171ee6e92f351c73622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-instafail \
python3.11dist-pytest-instafail \
python311-pytest-instafail \
python3dist-pytest-instafail"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
