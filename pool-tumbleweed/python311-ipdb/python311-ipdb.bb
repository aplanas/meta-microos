SUMMARY = "IPython-enabled pdb"
DESCRIPTION = "ipdb exports functions to access the IPython_ debugger, which features \
tab completion, syntax highlighting, better tracebacks, better \
introspection with the same interface as the `pdb` module."
LICENSE = "BSD-3-Clause"

PV = "0.13.13"

RPM_NAME = "python311-ipdb-0.13.13-1.4.noarch.rpm"
RPM_HASH = "06d23fb26f9882319692653741b8e1d8088ca2a4ca692294605533e70d97ab41000ba6f854f3ee85e57f9737bac7bca8336094f946c80e5fc21b8d41fe190a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipdb \
python3-ipdb \
python3-jupyter-ipdb \
python3.11dist-ipdb \
python311-ipdb \
python311-jupyter-ipdb \
python3dist-ipdb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-decorator \
update-alternatives"

inherit rpm
