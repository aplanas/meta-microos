SUMMARY = "Describe-style plugin for pytest"
DESCRIPTION = "Describe-style plugin for pytest."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-pytest-describe-2.1.0-1.1.noarch.rpm"
RPM_HASH = "614c6226ed8b95b22a71de62f16872f5b0c2328fabbd26c2967f76747178df19fcc9d7281eaca5819b4b071287919842454fbcc9953a71e2db96c0d84791e3d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-describe) \
python39-pytest-describe \
python3dist(pytest-describe)"

RDEPENDS:${PN} += "python(abi) \
python39-py \
python39-pytest"

inherit rpm
