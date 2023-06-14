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

RPM_NAME = "python39-ciscoconfparse-1.7.18-1.1.noarch.rpm"
RPM_HASH = "67a77415723725ebedd9e27c3fe4f867d4b3c05e2fdf2bdb83d5e94c624d57e09ade4ecba097a25a8e70d7291cac687b88889b49680d24a485616f0438d9e742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ciscoconfparse \
python39-ciscoconfparse \
python3dist-ciscoconfparse"

RDEPENDS:${PN} += "python-abi \
python39-dnspython \
python39-loguru \
python39-toml"

inherit rpm
