SUMMARY = "Describe-style plugin for pytest"
DESCRIPTION = "Describe-style plugin for pytest."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-pytest-describe-2.1.0-1.3.noarch.rpm"
RPM_HASH = "685ac491c2d98359425c67b3833ce96173431925cbfb5917fd6a4bbae97ad59daec678ae100e4f39da78b9e6a22bf5651df8231db3591954b8beec22bcebaa84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-describe \
python310-pytest-describe \
python3dist-pytest-describe"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pytest"

inherit rpm
