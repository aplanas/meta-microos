SUMMARY = "Test utilities for code working with files and commands"
DESCRIPTION = "Testpath is a collection of utilities for Python code working with \
files and commands. \
 \
It contains functions to check things on the filesystem, and tools \
for mocking system commands and recording calls to those."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python39-testpath-0.6.0-2.1.noarch.rpm"
RPM_HASH = "b63709db0bfe11dc5c5af7752955cb80cbbf4efa23a4fb9d20f227158df02a4dd41f014ef118247c62c3c42229b897898cc054c7ec223562b67bffde8de22682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(testpath) \
python39-testpath \
python3dist(testpath)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
