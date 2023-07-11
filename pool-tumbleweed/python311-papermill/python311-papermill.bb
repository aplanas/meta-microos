SUMMARY = "Tool to parametrize and run Jupyter and nteract Notebooks"
DESCRIPTION = "Papermill is a tool for parameterizing, executing, \
and analyzing Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python311-papermill-2.4.0-2.2.noarch.rpm"
RPM_HASH = "47a7593d5d8dc4c94c654e55e2bdf88ca57341448664dc8653e8a20bb1c8cb3964f8bad8d58160c46195c08bead7154e4e0850404fa7a7aa958b46763436df24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-papermill \
python3.11dist-papermill \
python311-papermill \
python3dist-papermill"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-ansiwrap \
python311-click \
python311-entrypoints \
python311-nbclient \
python311-nbformat \
python311-requests \
python311-tenacity \
python311-tqdm \
update-alternatives"

inherit rpm
