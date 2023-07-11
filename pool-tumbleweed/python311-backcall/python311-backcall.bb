SUMMARY = "Specifications for callback functions passed in to an API"
DESCRIPTION = "If code lets other people supply callback functions, it is important \
to specify the function signature that is being expected, and to \
check that functions support that. Adding extra parameters later \
would break other peoples code unless one is careful. \
backcall provides a way of specifying the callback signature using a \
prototype function."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python311-backcall-0.2.0-2.3.noarch.rpm"
RPM_HASH = "bc7090cf26767970f575c72bd165a21e271b2775fc9fa12056c9645710d45bb8edb9019e4e35a8289662d01f0c54729a93457ec35ddb5d837041a894a7d7b60c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-backcall \
python3.11dist-backcall \
python311-backcall \
python3dist-backcall"

RDEPENDS:${PN} += "python-abi"

inherit rpm
