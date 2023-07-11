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

RPM_NAME = "python310-ciscoconfparse-1.7.18-1.3.noarch.rpm"
RPM_HASH = "8450b249aa3cedb47b77bb13d734e8e24d561b77b7c136cbb3eea9cfcf3b1a44cc091198e3881ea2294f59bfbb6771d8900076bd805bf7cc9df80136d4713cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ciscoconfparse \
python310-ciscoconfparse \
python3dist-ciscoconfparse"

RDEPENDS:${PN} += "python-abi \
python310-dnspython \
python310-loguru \
python310-toml"

inherit rpm
