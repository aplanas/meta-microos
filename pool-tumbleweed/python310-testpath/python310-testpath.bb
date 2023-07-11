SUMMARY = "Test utilities for code working with files and commands"
DESCRIPTION = "Testpath is a collection of utilities for Python code working with \
files and commands. \
 \
It contains functions to check things on the filesystem, and tools \
for mocking system commands and recording calls to those."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python310-testpath-0.6.0-2.3.noarch.rpm"
RPM_HASH = "7a18671fc5154b363cefaee1730144c7b64500c3277006d02d1729702499b8402e9eee4211d28773a0793c86d623da2a47cbe1a3794f1c7c59b1cff49b92aad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-testpath \
python310-testpath \
python3dist-testpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
