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

RPM_NAME = "python311-ciscoconfparse-1.7.18-1.1.noarch.rpm"
RPM_HASH = "455cfb6a49780da03c7a1dbfefea69023c05b806e35fc5de91faf41602c16966d7dc2502e10bb87ae5cf02b06ad0fd31e07dc4972d7b1a889e23712da9c9ca54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ciscoconfparse \
python311-ciscoconfparse \
python3dist-ciscoconfparse"

RDEPENDS:${PN} += "python-abi \
python311-dnspython \
python311-loguru \
python311-toml"

inherit rpm
