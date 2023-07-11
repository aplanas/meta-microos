SUMMARY = "Translations for the Jupyter Notebook"
DESCRIPTION = "Provides translations for the Jupyter notebook. \
 \
This package provides the Python module translations."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "python39-notebook-lang-6.5.4-1.2.noarch.rpm"
RPM_HASH = "6f34642fd3927df303f15d8ad52bf2ed5345a9258ade90f9e446892727bdf59a026657a484665a8822289989d8a90f7b733a5998a089de49cf9f7999308e3daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-notebook-lang \
python39-notebook-lang \
python39-notebook-lang-all"

RDEPENDS:${PN} += "python-abi \
python39-notebook"

inherit rpm
