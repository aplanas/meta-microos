SUMMARY = "Tool to parametrize and run Jupyter and nteract Notebooks"
DESCRIPTION = "Papermill is a tool for parameterizing, executing, \
and analyzing Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python310-papermill-2.4.0-2.1.noarch.rpm"
RPM_HASH = "460b451b569c56d2b3d9d15410a7b4457478de3dea89347a131bd56025fb2a6a18600c0126b4b0ef6690f6fee8469774f354b0cd29c264149368ec8538b655ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-papermill \
python3.10dist(papermill) \
python310-papermill \
python3dist(papermill)"

RDEPENDS:${PN} += "(python310-typing_extensions if python310-azure-storage-blob) \
/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-ansiwrap \
python310-click \
python310-entrypoints \
python310-nbclient \
python310-nbformat \
python310-requests \
python310-tenacity \
python310-tqdm \
update-alternatives"

inherit rpm
