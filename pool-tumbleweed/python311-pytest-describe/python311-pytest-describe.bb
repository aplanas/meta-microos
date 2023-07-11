SUMMARY = "Describe-style plugin for pytest"
DESCRIPTION = "Describe-style plugin for pytest."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-pytest-describe-2.1.0-1.3.noarch.rpm"
RPM_HASH = "ed500243bdcc10f4eb11290965257d4c4bc9f8b42db744694ff1376629395174e1d59dc8fa58228d6052d641d3e1651fccc8619e719dda46bd0610890e44d009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-describe \
python3.11dist-pytest-describe \
python311-pytest-describe \
python3dist-pytest-describe"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pytest"

inherit rpm
