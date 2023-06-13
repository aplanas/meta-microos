SUMMARY = "Tool to parametrize and run Jupyter and nteract Notebooks"
DESCRIPTION = "Papermill is a tool for parameterizing, executing, \
and analyzing Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python311-papermill-2.4.0-2.1.noarch.rpm"
RPM_HASH = "40d1a562503dedb96d3e4bfd0af05f239ce317916742885e8e18329d7353e5c9386f92321d0ebfa54f68986d7c361577460a3016679cfd0099c1adddbbe919a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(papermill) \
python311-papermill \
python3dist(papermill)"

RDEPENDS:${PN} += "(python311-typing_extensions if python311-azure-storage-blob) \
/bin/sh \
/usr/bin/python3.11 \
python(abi) \
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
