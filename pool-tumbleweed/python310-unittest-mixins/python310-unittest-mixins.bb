SUMMARY = "Helpful mixins for unittest classes"
DESCRIPTION = "Helpful mixins for unittest classes."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python310-unittest-mixins-1.6-2.8.noarch.rpm"
RPM_HASH = "99c6d2da43ef843d5784f8a1365e9cdc163db5396f505645d521ecbb746fd153e40257f008a94ce9be9f11220456acb49f2356e43cd23345f2ae14c2b7cd841b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unittest-mixins \
python3.10dist-unittest-mixins \
python310-unittest-mixins \
python3dist-unittest-mixins"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
