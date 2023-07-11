SUMMARY = "Translations for the Jupyter Notebook"
DESCRIPTION = "Provides translations for the Jupyter notebook. \
 \
This package provides the jupyter component translations."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "jupyter-notebook-lang-6.5.4-1.2.noarch.rpm"
RPM_HASH = "cc1be25177fa7325ba969f0ec38eaf4fc252c8f572c40eafc68960e001096d4c45a920f877ca64a24202a0ce11ab47965ea29025b67a959287442936c9532a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook-lang \
jupyter-notebook-lang-all"

RDEPENDS:${PN} += "jupyter-notebook \
python3-notebook-lang"

inherit rpm
