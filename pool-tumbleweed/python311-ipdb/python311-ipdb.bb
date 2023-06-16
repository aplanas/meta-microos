SUMMARY = "IPython-enabled pdb"
DESCRIPTION = "ipdb exports functions to access the IPython_ debugger, which features \
tab completion, syntax highlighting, better tracebacks, better \
introspection with the same interface as the `pdb` module."
LICENSE = "BSD-3-Clause"

PV = "0.13.13"

RPM_NAME = "python311-ipdb-0.13.13-1.2.noarch.rpm"
RPM_HASH = "220b2aaaae93b9758965946dd4e871e148b703e54aa579e6f47008c1e2cdfa3f2ee14296d212a6390708070876965c65c67ccdf5630bb0149bfd5ceb54a1bbf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ipdb \
python311-ipdb \
python311-jupyter-ipdb \
python3dist-ipdb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-decorator \
update-alternatives"

inherit rpm
