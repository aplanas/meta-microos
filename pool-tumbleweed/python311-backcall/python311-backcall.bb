SUMMARY = "Specifications for callback functions passed in to an API"
DESCRIPTION = "If code lets other people supply callback functions, it is important \
to specify the function signature that is being expected, and to \
check that functions support that. Adding extra parameters later \
would break other peoples code unless one is careful. \
backcall provides a way of specifying the callback signature using a \
prototype function."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python311-backcall-0.2.0-2.1.noarch.rpm"
RPM_HASH = "953d015593eddf82f33b5d0043e78266b124bfe6c2d14691a6bea4da235e3ded9602494e1e13559ff3ea705097da2ca2bb0d68d68af4598c658dcb367ffdf57e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-backcall \
python311-backcall \
python3dist-backcall"

RDEPENDS:${PN} += "python-abi"

inherit rpm
