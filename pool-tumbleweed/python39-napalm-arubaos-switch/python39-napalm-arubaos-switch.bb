SUMMARY = "NAPALM - ArubaOS network driver"
DESCRIPTION = "ArubaOS driver support for NAPLAM network automation. \
This Drivers uses the REST interface."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-napalm-arubaos-switch-0.2.0-3.6.noarch.rpm"
RPM_HASH = "370a25258175b0a7a2a5d3f026f7b6b97a5d2df64bcdabd9309b9d9971b680f34f123dbce34bfbb35e2fd670b3924c25f454a75585b081c711a753af1f38082c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-napalm-arubaos-switch \
python39-napalm-arubaos-switch \
python3dist-napalm-arubaos-switch"

RDEPENDS:${PN} += "python-abi \
python39-napalm \
python39-netaddr \
python39-requests \
python39-requests-toolbelt \
python39-textfsm"

inherit rpm
