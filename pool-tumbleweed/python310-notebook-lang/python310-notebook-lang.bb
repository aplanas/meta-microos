SUMMARY = "Translations for the Jupyter Notebook"
DESCRIPTION = "Provides translations for the Jupyter notebook. \
 \
This package provides the Python module translations."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "python310-notebook-lang-6.5.4-1.1.noarch.rpm"
RPM_HASH = "10e4b51dd365cc0a1cff7dc397d118a70660d861b48af263f666cf7f4768baa376bbcdd1214b8cebc7b694d77e7f5fcfee3e7ef84a26f512fe8c07d74b9264c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_notebook-lang \
python3-notebook-lang \
python3-notebook-lang-all \
python310-jupyter_notebook-lang \
python310-notebook-lang \
python310-notebook-lang-all"

RDEPENDS:${PN} += "python(abi) \
python310-notebook"

inherit rpm
