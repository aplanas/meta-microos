SUMMARY = "A deep merge function for Python"
DESCRIPTION = "A deep merge function for Python."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python311-mergedeep-1.3.4-3.1.noarch.rpm"
RPM_HASH = "a1a853a0f3ad48fb7087eb08630a237af4bcb3fcdc4fad9255f3e60d6aa3708fcc344aff5f84462585ac48b9403f7f0dd5b60d57c1e543270060188b7d3591d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mergedeep \
python3.11dist-mergedeep \
python311-mergedeep \
python3dist-mergedeep"

RDEPENDS:${PN} += "python-abi"

inherit rpm
