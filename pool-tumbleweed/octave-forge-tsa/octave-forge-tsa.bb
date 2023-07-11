SUMMARY = "Time Series Analysis Toolbox for Octave"
DESCRIPTION = "Stochastic concepts and maximum entropy methods for time series analysis. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "4.6.3"

RPM_NAME = "octave-forge-tsa-4.6.3-1.8.noarch.rpm"
RPM_HASH = "16b49a04e238f5636a9df6b200a865608815fd6bcfe48f19d08f8ee3156084e5fa39c74360f46e7d401794973c1b20a66e4a660b88f7f8bb0bfe74f1e1e161a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-tsa"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-nan"

inherit rpm
