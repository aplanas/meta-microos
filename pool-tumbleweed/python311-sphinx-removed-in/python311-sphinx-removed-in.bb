SUMMARY = "Sphinx directives versionremoved and removed-in"
DESCRIPTION = "Sphinx Removed In Extension"
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python311-sphinx-removed-in-0.2.1-2.5.noarch.rpm"
RPM_HASH = "b980a5661032115bb692e2463cc86ec0384459f27d216c391ca68f94d5c95e4d5815cdd5ad551c1d7d7ec35794f6034cff0bedb555cd54f0e3848ca6ab8e5804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-removed-in \
python3.11dist-sphinx-removed-in \
python311-sphinx-removed-in \
python3dist-sphinx-removed-in"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
