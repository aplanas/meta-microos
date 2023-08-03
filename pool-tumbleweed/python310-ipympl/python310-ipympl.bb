SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python310-ipympl-0.9.3-10.3.noarch.rpm"
RPM_HASH = "a695baa963189a50c128c0bbed2e93f7b5e2ff13d60cc40dd7eb10e78e75372c447bef5d8c1193db20726e562dcfa6ae448175e4b79337510103e1aa88066eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipympl \
python310-ipympl \
python310-jupyter-ipympl \
python3dist-ipympl"

RDEPENDS:${PN} += "-python310-ipywidgets >= 7.6.0 with python310-ipywidgets < 9 \
-python310-matplotlib >= 3.4.0 with python310-matplotlib < 4 \
jupyter-matplotlib \
python-abi \
python310-Pillow \
python310-ipython \
python310-ipython-genutils \
python310-matplotlib-web \
python310-numpy \
python310-traitlets"

inherit rpm
