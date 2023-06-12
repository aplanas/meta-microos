SUMMARY = "IPython-enabled pdb"
DESCRIPTION = "ipdb exports functions to access the IPython_ debugger, which features \
tab completion, syntax highlighting, better tracebacks, better \
introspection with the same interface as the `pdb` module."
LICENSE = "BSD-3-Clause"

PV = "0.13.13"

RPM_NAME = "python310-ipdb-0.13.13-1.2.noarch.rpm"
RPM_HASH = "2a4afc177841948c189e5125539ae652c6f210e37079009e02a7bf2acedc578dfe6705a84f47107ef042f8daaf14ab8f09c1bf03b3b2b21a7f0c11a6d0dbdde4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipdb \
python3-ipdb \
python3-jupyter_ipdb \
python3.10dist(ipdb) \
python310-ipdb \
python310-jupyter_ipdb \
python3dist(ipdb)"
RDEPENDS:${PN} += "(python310-ipython >= 7.16.3 if python310-base < 3.7) \
(python310-ipython >= 7.31.1 if python310-base >= 3.7) \
(python310-tomli if python310-base < 3.11) \
/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-decorator \
update-alternatives"

inherit rpm
