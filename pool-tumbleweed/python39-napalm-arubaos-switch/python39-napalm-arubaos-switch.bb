SUMMARY = "NAPALM - ArubaOS network driver"
DESCRIPTION = "ArubaOS driver support for NAPLAM network automation. \
This Drivers uses the REST interface."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-napalm-arubaos-switch-0.2.0-3.4.noarch.rpm"
RPM_HASH = "4717a42749f400dbd467b7bfc69bd12e59f3b0409dc545c500f5b88b488ee3c6b7e3eba36703f7a31cf3fd5597c1800e4ad2f65c57a37fe4a450bb0dddfb4aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(napalm-arubaos-switch) \
python39-napalm-arubaos-switch \
python3dist(napalm-arubaos-switch)"
RDEPENDS:${PN} += "python(abi) \
python39-napalm \
python39-netaddr \
python39-requests \
python39-requests-toolbelt \
python39-textfsm"

inherit rpm
