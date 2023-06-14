SUMMARY = "Sphinx Qt documentation"
DESCRIPTION = "This is plugin to add cross-link to qt documentation for python code created with PyQt5/6 or PySide2/6."
LICENSE = "BSD-2-Clause"

PV = "0.4.1"

RPM_NAME = "python311-sphinx-qt-documentation-0.4.1-1.2.noarch.rpm"
RPM_HASH = "735b64abc412d4be200ec5b637c77e12f4139ef938ac98def135bbbec3edfac6c588cd311f30c7125562c31f3354ea17aa3b8b6d22be5a91cc193aaea30e503a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinx-qt-documentation \
python311-sphinx-qt-documentation \
python3dist-sphinx-qt-documentation"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
