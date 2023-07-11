SUMMARY = "Specifications for callback functions passed in to an API"
DESCRIPTION = "If code lets other people supply callback functions, it is important \
to specify the function signature that is being expected, and to \
check that functions support that. Adding extra parameters later \
would break other peoples code unless one is careful. \
backcall provides a way of specifying the callback signature using a \
prototype function."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python310-backcall-0.2.0-2.3.noarch.rpm"
RPM_HASH = "a3c8205f7cd80d2ace52320530d1110b658d977909bd5b09d14039055067a438ed77a799f7ce69183029729a1155e345ccb4689a37ab6b6f3c9184f2886325a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-backcall \
python310-backcall \
python3dist-backcall"

RDEPENDS:${PN} += "python-abi"

inherit rpm
