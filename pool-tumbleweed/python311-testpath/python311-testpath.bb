SUMMARY = "Test utilities for code working with files and commands"
DESCRIPTION = "Testpath is a collection of utilities for Python code working with \
files and commands. \
 \
It contains functions to check things on the filesystem, and tools \
for mocking system commands and recording calls to those."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python311-testpath-0.6.0-2.3.noarch.rpm"
RPM_HASH = "be3d01d645f9cd13baa44d5efaf6a75a3a1e7fc20617176b39a76faa0655e98f57c405f1a1db0498fb55341ffda53766edc52ac4a6a572e74817658f0c673634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testpath \
python3.11dist-testpath \
python311-testpath \
python3dist-testpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
