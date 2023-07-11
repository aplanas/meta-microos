SUMMARY = "C/C++ source code security flaw examination tool"
DESCRIPTION = "Flawfinder scans through C/C++ source code, identifying lines \
('hits') with potential security flaws. By default it reports hits \
sorted by severity, with the riskiest lines first."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.19"

RPM_NAME = "flawfinder-2.0.19-1.9.noarch.rpm"
RPM_HASH = "550c0518ca86175d614835b5c7ab5df9ed8112f1ce29294baa766d2800f022f079445a467f5dc7169bc44c3926d5ff8c36310c8cab4b3e6be9e38139d59b738b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flawfinder \
python3.11dist-flawfinder \
python3dist-flawfinder"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
