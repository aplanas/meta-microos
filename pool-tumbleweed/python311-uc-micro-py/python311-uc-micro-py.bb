SUMMARY = "Micro subset of unicode data files for linkify-it-py projects"
DESCRIPTION = "Micro subset of unicode data files for linkify-it-py projects."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-uc-micro-py-1.0.1-2.3.noarch.rpm"
RPM_HASH = "c2e67859dc830eab213cddbb737e5b70a2d675ddb5e123b192c7ec19bddf611486194bb3f63f427881b76b0fafd1db2dd6fb9ba43d7f3b276f0b6b0d2e0baa51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uc-micro-py \
python3.11dist-uc-micro-py \
python311-uc-micro-py \
python3dist-uc-micro-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
