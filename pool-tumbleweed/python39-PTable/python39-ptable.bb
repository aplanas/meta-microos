SUMMARY = "Python library for displaying data as tabular ASCII"
DESCRIPTION = "Python library for displaying tabular data in an ASCII table format."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python39-PTable-0.9.2-2.12.noarch.rpm"
RPM_HASH = "1b020a7d787bd8c60cf49f82f92661d18382aecd61ffda2e76278ad42012192e0e90cbc394458b7ae7604060feb6de5855205f02e11aa855759fa8ca37837f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ptable \
python39-PTable \
python3dist-ptable"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
