SUMMARY = "Black format checking plugin for pytest"
DESCRIPTION = "A pytest plugin to enable format checking with black."
LICENSE = "MIT"

PV = "0.3.12"

RPM_NAME = "python39-pytest-black-0.3.12-2.12.noarch.rpm"
RPM_HASH = "a4e06b8b13feae712175855512faff2e3a10c6f1b26650b639711ce81073c5f7e8894d6883f38b84dfd79d06e4d516190fe8b748902698e689b90f7bde9e85c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-black \
python39-pytest-black \
python3dist-pytest-black"

RDEPENDS:${PN} += "python-abi \
python39-black \
python39-pytest \
python39-toml"

inherit rpm
