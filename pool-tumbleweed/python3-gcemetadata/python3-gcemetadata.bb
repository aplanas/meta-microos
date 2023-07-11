SUMMARY = "Python module for collecting instance metadata from GCE"
DESCRIPTION = "A module for collecting instance metadata from Google Compute Engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.4"

RPM_NAME = "python3-gcemetadata-1.0.4-1.10.noarch.rpm"
RPM_HASH = "7ab37ed27f0988a690543566d9d476ec8e648a973f478af4b3df5f5718277f384d6e3d342df5b5b644cf7f411036ec0ac7afb522fcef6ae2719a88af2175e72a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gcemetadata \
python3-gcemetadata \
python3.11dist-gcemetadata \
python3dist-gcemetadata"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
