SUMMARY = "Quick-and-dirty debugging output for tired programmers"
DESCRIPTION = "Quick-and-dirty debugging output for tired programmers."
LICENSE = "Apache-2.0"

PV = "2.7"

RPM_NAME = "python311-q-2.7-1.4.noarch.rpm"
RPM_HASH = "704c7212cc3550e839c37d36011212ad2373c67ec46a7f4f1aa2bb03175140d34e7b982da73e5f0dff1df53bd07178126cd162398416c27c985f0f7388c01bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-q \
python3.11dist-q \
python311-q \
python3dist-q"

RDEPENDS:${PN} += "python-abi"

inherit rpm
