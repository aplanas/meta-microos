SUMMARY = "Library for parsing, querying and modifying Cisco IOS-style configurations"
DESCRIPTION = "ciscoconfparse is a Python library, which parses through Cisco IOS-style \
(and other vendor) configurations.  It can: \
 \
- Audit existing router / switch / firewall / wlc configurations \
- Retrieve portions of the configuration \
- Modify existing configurations \
- Build new configurations \
 \
The library examines an IOS-style config and breaks it into a set of linked \
parent / child relationships.  You can perform complex queries about these \
relationships."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.18"

RPM_NAME = "python39-ciscoconfparse-1.7.18-1.3.noarch.rpm"
RPM_HASH = "bdfef51263d9d4f2ac00b3e866ad02d4b9d3f44d04a2dc211f3cf1de0c4995e2f39585556a799eee9c6ab313983eb33c66b7820bd88f64deae06caca47583d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ciscoconfparse \
python39-ciscoconfparse \
python3dist-ciscoconfparse"

RDEPENDS:${PN} += "python-abi \
python39-dnspython \
python39-loguru \
python39-toml"

inherit rpm
