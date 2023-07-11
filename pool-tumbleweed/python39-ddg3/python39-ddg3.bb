SUMMARY = "Library for querying the Duck Duck Go API"
DESCRIPTION = "A Python3 library for querying the Duck Duck Go API."
LICENSE = "BSD-3-Clause"

PV = "0.6.6git~20170824T092521~0ef6b2f"

RPM_NAME = "python39-ddg3-0.6.6git~20170824T092521~0ef6b2f-2.14.noarch.rpm"
RPM_HASH = "68f12e093847481eab7ce3bdb9da520164af777603d80fc49db1d72e6a354d65149d90a1ac346db7df8656c2e3b977339eaf59c008660deaf64eeae7e747ff21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ddg3 \
python39-ddg3 \
python3dist-ddg3"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-requests \
update-alternatives"

inherit rpm
