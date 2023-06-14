SUMMARY = "Translations for the Jupyter Notebook"
DESCRIPTION = "Provides translations for the Jupyter notebook. \
 \
This package provides the Python module translations."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "python39-notebook-lang-6.5.4-1.1.noarch.rpm"
RPM_HASH = "ff4f44db6f9a651f156edee84e3290b98429e31c4ad08be7b3664cb2aa82087b57b4a7b323abbab94b27d5d096d99dd2a6e4cc219c1530940a2d0da202e622a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-notebook-lang \
python39-notebook-lang \
python39-notebook-lang-all"

RDEPENDS:${PN} += "python-abi \
python39-notebook"

inherit rpm
