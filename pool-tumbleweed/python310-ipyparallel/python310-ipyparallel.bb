SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "python310-ipyparallel-8.6.1-1.2.noarch.rpm"
RPM_HASH = "8e62c30bf76de1daf8501b9e34d1790d5f888d8771955084905a0db84b7737c1bc4c6c6440edcd72d43a4bacb6b68cce56fb2640ae5eb82575848716595dd8f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyparallel \
python3-jupyter_ipyparallel \
python3.10dist(ipyparallel) \
python310-ipyparallel \
python310-jupyter_ipyparallel \
python3dist(ipyparallel)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
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
