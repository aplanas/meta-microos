SUMMARY = "Translations for the Jupyter Notebook"
DESCRIPTION = "Provides translations for the Jupyter notebook. \
 \
This package provides the Python module translations."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "python311-notebook-lang-6.5.4-1.2.noarch.rpm"
RPM_HASH = "a7920af847a4632aab6d9b11dd7fd6c98800368a46d3eeba9d7292b6e19ffce60028205ac0137a8283642e08794eec27ad08313d9fd837b2b57ba5e35964300e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-notebook-lang \
python3-notebook-lang \
python3-notebook-lang-all \
python311-jupyter-notebook-lang \
python311-notebook-lang \
python311-notebook-lang-all"

RDEPENDS:${PN} += "python-abi \
python311-notebook"

inherit rpm
