SUMMARY = "A patch parsing and application library"
DESCRIPTION = "A patch parsing and application library."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python310-whatthepatch-1.0.3-1.6.noarch.rpm"
RPM_HASH = "c0b34e743e3afc9bddc76d1f0cb11048e684123fa3a25a06e08242371caa2a9fa44b2510c225bbaca95bbe90083db2681097a0242c1d2247b5cff50ed6e6c8a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-whatthepatch \
python310-whatthepatch \
python3dist-whatthepatch"

RDEPENDS:${PN} += "ed \
patch \
python-abi"

inherit rpm
