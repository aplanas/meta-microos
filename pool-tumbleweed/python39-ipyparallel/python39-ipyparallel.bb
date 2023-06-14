SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "python39-ipyparallel-8.6.1-1.2.noarch.rpm"
RPM_HASH = "57b92560590b81467e2f4a324e14c04361f8b640bc3e2df398eb4fcd1d5bedb58728bcc99f960c090be0b547bbcd67aca7e19c15256643cd247480f4789deb62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyparallel \
python39-ipyparallel \
python39-jupyter-ipyparallel \
python3dist-ipyparallel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-decorator \
python39-entrypoints \
python39-ipykernel \
python39-ipython \
python39-jupyter-client \
python39-psutil \
python39-python-dateutil \
python39-pyzmq \
python39-tornado \
python39-tqdm \
python39-traitlets \
update-alternatives"

inherit rpm
