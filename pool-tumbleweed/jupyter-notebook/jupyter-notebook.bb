SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "jupyter-notebook-6.5.4-1.1.noarch.rpm"
RPM_HASH = "f1b4ffd6e024a048a7093f1eddaf6a4d10eccf3b3ec8259a05459491f0b70be506f8b062c6fe0db2bae557c25c419bf962534eddd08e294162755254f3cad48f"
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
