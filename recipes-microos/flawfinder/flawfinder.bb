SUMMARY = "C/C++ source code security flaw examination tool"
DESCRIPTION = "Flawfinder scans through C/C++ source code, identifying lines \
('hits') with potential security flaws. By default it reports hits \
sorted by severity, with the riskiest lines first."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.19"

RPM_NAME = "flawfinder-2.0.19-1.8.noarch.rpm"
RPM_HASH = "46ada77416d8601c94275d2adc057aebe96463ba79262296e009cb39e2fa9ef65bf9c50d390176a03fda759d570505472ea73b0ce4b10ebb2c2e70f097151e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flawfinder python3.10dist(flawfinder) python3dist(flawfinder)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3"

inherit rpm
