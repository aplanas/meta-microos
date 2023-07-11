SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "jupyter-notebook-6.5.4-1.2.noarch.rpm"
RPM_HASH = "3f74b59f0b3ac53dceaff75bc0593f6314decd762d5681827339bc07204770da148f6d64b4b063d5d66ee60767b9014ff70060abd64e50157e4e0990da9abfad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook \
jupyter-notebook-doc"

RDEPENDS:${PN} += "jupyter-ipykernel \
jupyter-jupyter-client \
jupyter-jupyter-core \
jupyter-nbconvert \
jupyter-notebook-filesystem \
python3-notebook"

inherit rpm
