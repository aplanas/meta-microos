SUMMARY = "Client library for interacting with Gerrit code review"
DESCRIPTION = "Client library for interacting with Gerrit code review rest api \
 \
Pygerrit2 provides a simple interface for clients to interact with \
Gerrit code review via its rest api. \
 \
See also: https://gerritcodereview.com/"
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "python39-pygerrit2-2.0.15-1.6.noarch.rpm"
RPM_HASH = "c7b420e8e401d5942072b35e806841c066e3287aa39b7f6ce3a1b55f6bfc32c6a753fcd03a880d2ac68a494e650a69b99d2d61c44e83fe542ca0be6a6ad8d91f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pygerrit2) \
python39-pygerrit2 \
python3dist(pygerrit2)"

RDEPENDS:${PN} += "python(abi) \
python39-pbr \
python39-requests"

inherit rpm
