SUMMARY = "Plugin to display pytest execution output like a specification"
DESCRIPTION = "pytest plugin to display test execution output like a specification."
LICENSE = "GPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "python39-pytest-spec-3.2.0-1.8.noarch.rpm"
RPM_HASH = "350581ca8fc2dfb1e1a2fcc469a31e03a996ec251a574754d780f61a2389e0f576f3898581789b04b9e6dced5e6608b550a0578d16361b42e9db9d82fc0c745a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-spec \
python39-pytest-spec \
python3dist-pytest-spec"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
