SUMMARY = "Tool to parametrize and run Jupyter and nteract Notebooks"
DESCRIPTION = "Papermill is a tool for parameterizing, executing, \
and analyzing Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python39-papermill-2.4.0-2.2.noarch.rpm"
RPM_HASH = "126b81315ab2c871161739c885a8ee6717b7b97009f8240f3e4b244af01e9ffc061d4e5b11ed0fa46771acb3de11cb1530a7c9f25e8dde2aeb814017fd111bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-papermill \
python39-papermill \
python3dist-papermill"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-ansiwrap \
python39-click \
python39-entrypoints \
python39-nbclient \
python39-nbformat \
python39-requests \
python39-tenacity \
python39-tqdm \
update-alternatives"

inherit rpm
