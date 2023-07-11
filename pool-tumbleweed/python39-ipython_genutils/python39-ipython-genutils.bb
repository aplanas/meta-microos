SUMMARY = "Vestigial utilities from IPython"
DESCRIPTION = "This contains some common utilities shared by Jupyter and IPython projects \
during The Big Split. As soon as possible, those packages will remove their \
dependency on this, and this package will go away. \
 \
No projects should depend on this package directly.  It will be pulled in by \
whatever packages need it"
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python39-ipython_genutils-0.2.0-3.13.noarch.rpm"
RPM_HASH = "c522415529c633db7226175e0c3e2f6a77e984a10f4d0acee2cbb6a1ae57a8d7e774d0c734958f7f1c6c97db3f625c61e836b056525734b07ae3e8127f0389a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipython-genutils \
python39-ipython-genutils \
python3dist-ipython-genutils"

RDEPENDS:${PN} += "python-abi \
python39 \
python39-pytest"

inherit rpm
