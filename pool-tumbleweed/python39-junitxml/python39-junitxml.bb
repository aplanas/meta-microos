SUMMARY = "A pyunit extension to output JUnit compatible XML"
DESCRIPTION = "A Python unittest TestResult that outputs JUnit compatible XML."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "python39-junitxml-0.7-4.9.noarch.rpm"
RPM_HASH = "263e68ff7b3e3895e43e0141580d442902f9fffc0e29bf51cb3164d8df5101511080a896ec9902ca8bc764832e3b9b9d2236fd1e8991b7bdecb159cae1c1f407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-junitxml \
python39-junitxml \
python3dist-junitxml"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
