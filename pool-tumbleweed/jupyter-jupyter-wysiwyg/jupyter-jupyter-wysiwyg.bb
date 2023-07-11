SUMMARY = "WYSIWYG editing functionality for markdown/HTML cells in Jupyter"
DESCRIPTION = "This is an nbextension that enables WYSIWYG editing functionality for \
HTML/Markdown cells in Jupyter."
LICENSE = "BSD-3-Clause"

PV = "19.10"

RPM_NAME = "jupyter-jupyter-wysiwyg-19.10-2.20.noarch.rpm"
RPM_HASH = "4f86923155c8e46549eaba2abb072d6a256368625dc485d1aae44b9ff8760793cc91625a1b86817a8f5ee49b03547ecfc4d9dad13d8f4435e8f4377e6bbb1f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-jupyter-jupyter-wysiwyg \
jupyter-jupyter-wysiwyg \
python3-jupyter-wysiwyg \
python3.11dist-jupyter-wysiwyg \
python3dist-jupyter-wysiwyg"

RDEPENDS:${PN} += "/usr/bin/sh \
jupyter-notebook \
python-abi"

inherit rpm
