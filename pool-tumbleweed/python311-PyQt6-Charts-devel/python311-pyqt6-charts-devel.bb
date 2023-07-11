SUMMARY = "Devel files for python311-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-Charts-devel-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "f15a82d0d97d817e9764ea7acfd94c0da53257e8a773931b4136612043ed0c663b27f4a81e590ffb198a2b45ac810266d67cf28052d4f0f5fb5fce430d7cdd0f"

RPROVIDES:${PN} += "python3-PyQt6-Charts-devel \
python311-PyQt6-Charts-devel"

RDEPENDS:${PN} += "python-abi \
python311-PyQt6-devel"

inherit rpm
