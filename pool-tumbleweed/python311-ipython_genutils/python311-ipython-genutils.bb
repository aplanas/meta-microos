SUMMARY = "Vestigial utilities from IPython"
DESCRIPTION = "This contains some common utilities shared by Jupyter and IPython projects \
during The Big Split. As soon as possible, those packages will remove their \
dependency on this, and this package will go away. \
 \
No projects should depend on this package directly.  It will be pulled in by \
whatever packages need it"
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python311-ipython_genutils-0.2.0-3.13.noarch.rpm"
RPM_HASH = "b645529012084b0058618c888cdf5a4fc1c5d940fbc24495baabca9608e89230277b8c749e727bcc7395c05627be7cda886a1e40cc83dece25c3c7ec254683f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipython-genutils \
python3.11dist-ipython-genutils \
python311-ipython-genutils \
python3dist-ipython-genutils"

RDEPENDS:${PN} += "python-abi \
python311 \
python311-pytest"

inherit rpm
