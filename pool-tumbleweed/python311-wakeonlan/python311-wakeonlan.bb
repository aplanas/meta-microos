SUMMARY = "A small python module for wake on lan"
DESCRIPTION = "A small python module for wake on lan."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-wakeonlan-3.0.0-1.3.noarch.rpm"
RPM_HASH = "a74edd6f72ff715f12b8b3329bb40b1f11a08b0b3b3019d19419c6a565325d87bb1e259cb52c3428515bb7751d67fe710c7dc241b976a99a2a9a81a071643ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wakeonlan \
python3.11dist-wakeonlan \
python311-wakeonlan \
python3dist-wakeonlan"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
