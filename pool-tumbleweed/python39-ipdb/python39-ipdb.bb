SUMMARY = "IPython-enabled pdb"
DESCRIPTION = "ipdb exports functions to access the IPython_ debugger, which features \
tab completion, syntax highlighting, better tracebacks, better \
introspection with the same interface as the `pdb` module."
LICENSE = "BSD-3-Clause"

PV = "0.13.13"

RPM_NAME = "python39-ipdb-0.13.13-1.4.noarch.rpm"
RPM_HASH = "c10fc679c3014ae41a87c052c4ba0a304f44203b498c3266d9957d843a18a6525d68af21033bec92c8cc43518e8734f4569b2d650941c56d6bcd575229c66818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipdb \
python39-ipdb \
python39-jupyter-ipdb \
python3dist-ipdb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-decorator \
update-alternatives"

inherit rpm
