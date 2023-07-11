SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.6.0"

RPM_NAME = "jupyter-nbconvert-7.6.0-1.2.noarch.rpm"
RPM_HASH = "a0ebf42e4e44d2326088ee524ecea2e45163b1b1f651b333e70014afbc2b28a2b95f3fca30057c8d62ded993c476e3de7ae29a6328e8b28ed004e75c98bda9d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbconvert"

RDEPENDS:${PN} += "jupyter-ipykernel \
jupyter-jupyter-core \
python3dist-nbconvert"

inherit rpm
