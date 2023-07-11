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

RPM_NAME = "python311-ciscoconfparse-1.7.18-1.3.noarch.rpm"
RPM_HASH = "ca646825ec0ccee117f9d4ca547ae8288ea5af48d443fe4640f7a4d56b5359cf046d4ad21e750ceb9906d36fa5e1ce11ff8006dfea7199194ed31894916dfa13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ciscoconfparse \
python3.11dist-ciscoconfparse \
python311-ciscoconfparse \
python3dist-ciscoconfparse"

RDEPENDS:${PN} += "python-abi \
python311-dnspython \
python311-loguru \
python311-toml"

inherit rpm
