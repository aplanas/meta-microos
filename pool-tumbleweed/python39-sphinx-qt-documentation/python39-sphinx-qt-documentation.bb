SUMMARY = "Sphinx Qt documentation"
DESCRIPTION = "This is plugin to add cross-link to qt documentation for python code created with PyQt5/6 or PySide2/6."
LICENSE = "BSD-2-Clause"

PV = "0.4.1"

RPM_NAME = "python39-sphinx-qt-documentation-0.4.1-1.3.noarch.rpm"
RPM_HASH = "6cd472c9517fb3196bcc4df22ad71469ed6d783117dd85b024ff88fb86fd54134d27c7ab9c87028d0e497f5bc585bd3890694db00974ffac69000d1e1de1b900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-qt-documentation \
python39-sphinx-qt-documentation \
python3dist-sphinx-qt-documentation"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
