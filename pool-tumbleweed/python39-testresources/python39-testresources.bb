SUMMARY = "A pyunit extension for managing expensive test resources"
DESCRIPTION = "testresources: extensions to python unittest to allow declarative use \
of resources by test cases."
LICENSE = "(Apache-2.0 | BSD-3-Clause) & GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python39-testresources-2.0.1-8.1.noarch.rpm"
RPM_HASH = "a615df2f714ef88809547bca38d261b18691d5d0c3de9b8b5d38fb5b6d0263d9c99b7f76be80e450924966ec11c4e7661a2858011468d3a266dced44dceb8e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-testresources \
python39-testresources \
python3dist-testresources"

RDEPENDS:${PN} += "python-abi \
python39-pbr"

inherit rpm
