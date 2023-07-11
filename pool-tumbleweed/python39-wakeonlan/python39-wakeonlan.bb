SUMMARY = "A small python module for wake on lan"
DESCRIPTION = "A small python module for wake on lan."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-wakeonlan-3.0.0-1.3.noarch.rpm"
RPM_HASH = "25b84fc7bf0549df7c3b780f3e8d77dfb1ac4c3e8a252dbb40da4aff16fba245655c7042456e57b8d224bcd6b7869267451d9c4fa9247be0d00e272effaaa61c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wakeonlan \
python39-wakeonlan \
python3dist-wakeonlan"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
