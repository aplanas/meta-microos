SUMMARY = "NAPALM - Cisco ASA Driver network driver"
DESCRIPTION = "Cisco ASA Driver implementation for the NAPALM Network Automation Project. \
This driver makes use of the Cisco ASA REST API. The REST API is only \
available from software version 9.3.2 and up, and on the 5500-X series, \
ASAv, ASA on Firepower and ISA 3000 platforms."
LICENSE = "Apache-2.0"

PV = "20180525.8c54a85"

RPM_NAME = "python39-napalm-asa-20180525.8c54a85-1.3.noarch.rpm"
RPM_HASH = "28a0d385ff830af26373605f93bf54ce88cc72c6371bfec36717b0e2ac567a9a7892e6edd7f83a60862f258e531ff0de387c66e94d4661fdf7703c31156988be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-napalm-asa \
python39-napalm-asa \
python3dist-napalm-asa"

RDEPENDS:${PN} += "python-abi \
python39-napalm"

inherit rpm
