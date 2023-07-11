SUMMARY = "Specifications for callback functions passed in to an API"
DESCRIPTION = "If code lets other people supply callback functions, it is important \
to specify the function signature that is being expected, and to \
check that functions support that. Adding extra parameters later \
would break other peoples code unless one is careful. \
backcall provides a way of specifying the callback signature using a \
prototype function."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python39-backcall-0.2.0-2.3.noarch.rpm"
RPM_HASH = "126972b470287903cdf1c944a3703539d647195e744af53066973c4765c0b2a33e007fd314a15a43ec70c26cc4558c7cb096f173f2379b83dafcc68df33d681b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-backcall \
python39-backcall \
python3dist-backcall"

RDEPENDS:${PN} += "python-abi"

inherit rpm
