SUMMARY = "A deep merge function for Python"
DESCRIPTION = "A deep merge function for Python."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python311-mergedeep-1.3.4-2.9.noarch.rpm"
RPM_HASH = "9b810bc320c6eba49ea43567a19add3810e96fad50eafb49a2daf98da06116bbee8bc7d9e0704f8dbbd6fb612bd073f4bc5916ac6f9b5fc08b0a5bbb6a9c5f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mergedeep \
python3.11dist-mergedeep \
python311-mergedeep \
python3dist-mergedeep"

RDEPENDS:${PN} += "python-abi"

inherit rpm
