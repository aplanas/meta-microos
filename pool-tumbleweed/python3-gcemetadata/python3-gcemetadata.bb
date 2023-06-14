SUMMARY = "Python module for collecting instance metadata from GCE"
DESCRIPTION = "A module for collecting instance metadata from Google Compute Engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.4"

RPM_NAME = "python3-gcemetadata-1.0.4-1.9.noarch.rpm"
RPM_HASH = "87b7f6de335c41f0a3960f57888bc4b1def5e00e547376fc1d6567a71d58c19ccfd06fc5354bdd59f0a1a237ab44a6fe7c05e8202b772bb8e62366f505705358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gcemetadata \
python3-gcemetadata \
python3.10dist-gcemetadata \
python3dist-gcemetadata"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
