SUMMARY = "Vestigial utilities from IPython"
DESCRIPTION = "This contains some common utilities shared by Jupyter and IPython projects \
during The Big Split. As soon as possible, those packages will remove their \
dependency on this, and this package will go away. \
 \
No projects should depend on this package directly.  It will be pulled in by \
whatever packages need it"
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python310-ipython_genutils-0.2.0-3.13.noarch.rpm"
RPM_HASH = "b7c8b969104d43d136e07a9d6823fca481c03fe6868fd381d9d9fc21fe8f6d91b7c720218d6dd51e8d16cf9e2e878d702906f0cd68426618b7920bb2f8fba716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipython-genutils \
python310-ipython-genutils \
python3dist-ipython-genutils"

RDEPENDS:${PN} += "python-abi \
python310 \
python310-pytest"

inherit rpm
