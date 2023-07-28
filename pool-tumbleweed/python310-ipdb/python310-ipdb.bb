SUMMARY = "IPython-enabled pdb"
DESCRIPTION = "ipdb exports functions to access the IPython_ debugger, which features \
tab completion, syntax highlighting, better tracebacks, better \
introspection with the same interface as the `pdb` module."
LICENSE = "BSD-3-Clause"

PV = "0.13.13"

RPM_NAME = "python310-ipdb-0.13.13-2.1.noarch.rpm"
RPM_HASH = "3fdc348cbbf4e6cef47e5462ea62b7f626e218040a0cdab968f5d5ce7752f3428f62957c27f7fd0e5c00db8e78835ee794e92ff1f7340f37834e8ecddb5c877c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipdb \
python310-ipdb \
python310-jupyter-ipdb \
python3dist-ipdb"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-decorator \
update-alternatives"

inherit rpm
