SUMMARY = "Alternative CLI to 'dnf upgrade' suitable for automatic, regular execution"
DESCRIPTION = "Alternative CLI to 'dnf upgrade' suitable for automatic, regular execution."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "dnf-automatic-4.14.0-3.2.noarch.rpm"
RPM_HASH = "1f75e6cfb927a8316cb17f9446b042fd3620fb5ed4acd15343b2fd9a99dd10445991ec6e16bd3f57bdb4ce5ad2c660e07ddde31f3b596a698aa929b40c9bd41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dnf-automatic \
dnf-automatic"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
dnf \
python-abi"

inherit rpm
