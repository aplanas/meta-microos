SUMMARY = "Specifications for callback functions passed in to an API"
DESCRIPTION = "If code lets other people supply callback functions, it is important \
to specify the function signature that is being expected, and to \
check that functions support that. Adding extra parameters later \
would break other peoples code unless one is careful. \
backcall provides a way of specifying the callback signature using a \
prototype function."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python310-backcall-0.2.0-2.1.noarch.rpm"
RPM_HASH = "4b8a4ccd2a026dc5a7dedd313fb1521a662a7e8575d77205d73b0de012a64d7cab2c68750385507edceb03f3aa914ef72453c4aab931b5d503476d573f91399e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-backcall \
python3.10dist(backcall) \
python310-backcall \
python3dist(backcall)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
