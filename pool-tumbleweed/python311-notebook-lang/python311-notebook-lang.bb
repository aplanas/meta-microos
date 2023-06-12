SUMMARY = "Translations for the Jupyter Notebook"
DESCRIPTION = "Provides translations for the Jupyter notebook. \
 \
This package provides the Python module translations."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "python311-notebook-lang-6.5.4-1.1.noarch.rpm"
RPM_HASH = "17aa8dd1a39e9f1fa0080be368664c278bd76930266ded808fa234c71e5d9f8c45f67c3950df0d8c4df98204bcd00acb5c05d3cda999da6883ebf4e108fcc42b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyter_notebook-lang \
python311-notebook-lang \
python311-notebook-lang-all"
RDEPENDS:${PN} += "python(abi) \
python311-notebook"

inherit rpm
