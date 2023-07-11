SUMMARY = "Tool to parametrize and run Jupyter and nteract Notebooks"
DESCRIPTION = "Papermill is a tool for parameterizing, executing, \
and analyzing Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python310-papermill-2.4.0-2.2.noarch.rpm"
RPM_HASH = "07787174e0f07056985f96755e369c0c3068737dce1c5dc20afa56f2bec20703dea5143879e089f718cf63933d65c8c2c452c3328d0fa5920f37e6d31f20ddbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-papermill \
python310-papermill \
python3dist-papermill"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
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
