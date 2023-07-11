SUMMARY = "Miscellaneous convenience, extension and workaround code for Python"
DESCRIPTION = "The Simple Library for Python packages contain miscellaneous code for \
convenience, extension and workaround purposes. \
 \
This package provides the 'slip' and the 'slip.util' modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.5"

RPM_NAME = "python310-slip-0.6.5-6.16.noarch.rpm"
RPM_HASH = "cf2faf51a3f0b4c2ef4afaf3c783cd39aed0e0f9a0b0ed8e73b5427c46c2d51ca4699b87ad2f2a9902a66c833e7ebaeff22cb08488f602834c0bf1530a150489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-slip \
python310-slip \
python3dist-slip"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
