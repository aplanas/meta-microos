SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "python310-ipyparallel-8.6.1-1.3.noarch.rpm"
RPM_HASH = "b664bb5997f8a8f4d1e1d94e9d6172428c36d010b64e10c1d21c4b7a30425e92fcf9b6d125dddbde2cee45306653d2451b2c8d868a7e54a31e9d70f9e0cf51f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyparallel \
python310-ipyparallel \
python310-jupyter-ipyparallel \
python3dist-ipyparallel"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-decorator \
python310-entrypoints \
python310-ipykernel \
python310-ipython \
python310-jupyter-client \
python310-psutil \
python310-python-dateutil \
python310-pyzmq \
python310-tornado \
python310-tqdm \
python310-traitlets \
update-alternatives"

inherit rpm
