SUMMARY = "Sphinx Qt documentation"
DESCRIPTION = "This is plugin to add cross-link to qt documentation for python code created with PyQt5/6 or PySide2/6."
LICENSE = "BSD-2-Clause"

PV = "0.4.1"

RPM_NAME = "python311-sphinx-qt-documentation-0.4.1-1.3.noarch.rpm"
RPM_HASH = "f0497137959cf22c9113fb831dc538900cb8bb1730077638ec44f26a37562293b7bb0f09f83f26322f768ff963d6d536e76059848155802a8f50c5fab6b7c8db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-qt-documentation \
python3.11dist-sphinx-qt-documentation \
python311-sphinx-qt-documentation \
python3dist-sphinx-qt-documentation"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
