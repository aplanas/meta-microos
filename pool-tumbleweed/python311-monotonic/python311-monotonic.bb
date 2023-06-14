SUMMARY = "An implementation of time.monotonic() for Python 2 & < 33"
DESCRIPTION = "This module provides a ``monotonic()`` function which returns the \
value (in fractional seconds) of a clock which never goes backwards."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python311-monotonic-1.6-1.8.noarch.rpm"
RPM_HASH = "1088a4f607aa8e85bd04606187c584a42b43c61cc9b9ad4fe361327031d2ea0b9fe0cecca52aba2d0fcffb1d6b0634a810307e8af7542d7d8d2404da5392e16f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-monotonic \
python311-monotonic \
python3dist-monotonic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
