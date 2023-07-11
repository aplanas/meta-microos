SUMMARY = "Test utilities for code working with files and commands"
DESCRIPTION = "Testpath is a collection of utilities for Python code working with \
files and commands. \
 \
It contains functions to check things on the filesystem, and tools \
for mocking system commands and recording calls to those."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python39-testpath-0.6.0-2.3.noarch.rpm"
RPM_HASH = "ff6888a49592a37743ffa2dd69ee7347859625385f58b43b8cb4af277f7b7a4b57f56cbcccb9fbb468cab87fb6ea27e95774d0ba37c92aadb0248202d753b3a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-testpath \
python39-testpath \
python3dist-testpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
