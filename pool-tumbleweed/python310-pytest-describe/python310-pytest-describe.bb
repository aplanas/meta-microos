SUMMARY = "Describe-style plugin for pytest"
DESCRIPTION = "Describe-style plugin for pytest."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-pytest-describe-2.1.0-2.1.noarch.rpm"
RPM_HASH = "8411a7532a7098ac055c8585fa99d95dc90be8fde3dc69d5666f3183fd8cd13e39ebec4ba5e1dc239e09a56b349b3a9e5a1cc6f4d240422eecf826186a54432e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-describe \
python310-pytest-describe \
python3dist-pytest-describe"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pytest"

inherit rpm
