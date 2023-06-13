SUMMARY = "Jupyter Sphinx Extensions"
DESCRIPTION = "Jupyter Sphinx extensions enable jupyter-specific features in sphinx."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-jupyter-sphinx-0.4.0-1.5.noarch.rpm"
RPM_HASH = "f69b9a3328fbe0542ad51a86751671f8a30be33e0a42a258a210a11996b30c4432772aef5d0718ab9a4ab620bea35bd45dc266d4d89a8b56c38b7644f9eb296e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-sphinx \
python3-jupyter-sphinx \
python3-jupyter_sphinx \
python3.10dist(jupyter-sphinx) \
python310-jupyter-sphinx \
python310-jupyter_sphinx \
python3dist(jupyter-sphinx)"

RDEPENDS:${PN} += "python(abi) \
python310-IPython \
python310-Sphinx \
python310-ipywidgets \
python310-nbconvert \
python310-nbformat"

inherit rpm
