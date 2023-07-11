SUMMARY = "Sphinx Qt documentation"
DESCRIPTION = "This is plugin to add cross-link to qt documentation for python code created with PyQt5/6 or PySide2/6."
LICENSE = "BSD-2-Clause"

PV = "0.4.1"

RPM_NAME = "python310-sphinx-qt-documentation-0.4.1-1.3.noarch.rpm"
RPM_HASH = "c255ef525ba2b16fb81c7b98bca247b4b92496e7f96a8e8e5eaddb37b9766ad0d52e3953a87611cd3df3b5a81ff3033731dca5417bb9e148d60521f41414d204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-qt-documentation \
python310-sphinx-qt-documentation \
python3dist-sphinx-qt-documentation"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
