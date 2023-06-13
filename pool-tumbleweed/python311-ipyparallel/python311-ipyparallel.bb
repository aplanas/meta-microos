SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "python311-ipyparallel-8.6.1-1.2.noarch.rpm"
RPM_HASH = "ee4ed85c9aa2e22e898fc6ec19b0e60b40d8f59576d6ef77f7fa8800657f97024c55165580c4b1851e2c7ebb03dc514aba1b7b0886cf83a5703466724386771f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipyparallel) \
python311-ipyparallel \
python311-jupyter_ipyparallel \
python3dist(ipyparallel)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-decorator \
python311-entrypoints \
python311-ipykernel \
python311-ipython \
python311-jupyter-client \
python311-psutil \
python311-python-dateutil \
python311-pyzmq \
python311-tornado \
python311-tqdm \
python311-traitlets \
update-alternatives"

inherit rpm
