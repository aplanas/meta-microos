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

RPM_NAME = "python310-ciscoconfparse-1.7.18-1.1.noarch.rpm"
RPM_HASH = "e709d48844fbd9f23644c552a0d24255fcda6e907ba844a069b2e29ee9a6ed805693708817b68d054c30b86f72af110052e35b888fb6fe6b129c7776853cc7fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ciscoconfparse \
python3.10dist(ciscoconfparse) \
python310-ciscoconfparse \
python3dist(ciscoconfparse)"

RDEPENDS:${PN} += "python(abi) \
python310-dnspython \
python310-loguru \
python310-toml"

inherit rpm
