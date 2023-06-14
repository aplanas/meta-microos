SUMMARY = "Quick-and-dirty debugging output for tired programmers"
DESCRIPTION = "Quick-and-dirty debugging output for tired programmers."
LICENSE = "Apache-2.0"

PV = "2.7"

RPM_NAME = "python39-q-2.7-1.3.noarch.rpm"
RPM_HASH = "1df1a8aadca519b0b1f1495f194ae8ebc668164de5ff7c2b6f59aafb0f20870b2103375d8b3c87314c1c07a613822e113a0400dc1505ea1d9237c6b463204275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-q \
python39-q \
python3dist-q"

RDEPENDS:${PN} += "python-abi"

inherit rpm
