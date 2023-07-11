SUMMARY = "Quick-and-dirty debugging output for tired programmers"
DESCRIPTION = "Quick-and-dirty debugging output for tired programmers."
LICENSE = "Apache-2.0"

PV = "2.7"

RPM_NAME = "python39-q-2.7-1.4.noarch.rpm"
RPM_HASH = "4fdfae0e0a58781671d24dcbc5d7b1f07755cc6d552ccaca251dbfd7886d80bea56fc5bce13550679863c768183ad785c280301524d5d0a8a0c80fa96d713d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-q \
python39-q \
python3dist-q"

RDEPENDS:${PN} += "python-abi"

inherit rpm
