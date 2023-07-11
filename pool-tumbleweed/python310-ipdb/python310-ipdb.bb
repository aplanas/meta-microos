SUMMARY = "IPython-enabled pdb"
DESCRIPTION = "ipdb exports functions to access the IPython_ debugger, which features \
tab completion, syntax highlighting, better tracebacks, better \
introspection with the same interface as the `pdb` module."
LICENSE = "BSD-3-Clause"

PV = "0.13.13"

RPM_NAME = "python310-ipdb-0.13.13-1.4.noarch.rpm"
RPM_HASH = "e7d3199093f2abe8b8036554aba81993eb3a93f08488402915d084ed803eb6b1832cdec7913eca7905c095ebaac0ff583d49a3b29d99277c7b2be55c8fa65943"
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
