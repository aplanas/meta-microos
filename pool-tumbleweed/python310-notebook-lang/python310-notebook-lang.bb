SUMMARY = "Translations for the Jupyter Notebook"
DESCRIPTION = "Provides translations for the Jupyter notebook. \
 \
This package provides the Python module translations."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "python310-notebook-lang-6.5.4-1.2.noarch.rpm"
RPM_HASH = "89c3f475064be8639572b1159dcf2a10fe17c78aba9a46b1a9ac17b8f8427236384605a7b93a5afbaf96159156caa7e796bf7701999b7ab95b2a804061108209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-notebook-lang \
python310-notebook-lang \
python310-notebook-lang-all"

RDEPENDS:${PN} += "python-abi \
python310-notebook"

inherit rpm
