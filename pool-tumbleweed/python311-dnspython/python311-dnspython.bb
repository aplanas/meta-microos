SUMMARY = "A DNS toolkit for Python"
DESCRIPTION = "dnspython is a DNS toolkit for Python. It supports almost all \
record types. It can be used for queries, zone transfers, and \
dynamic updates. It supports TSIG authenticated messages and EDNS0. \
 \
dnspython provides both high and low level access to DNS. The high \
level classes perform queries for data of a given name, type, and \
class, and return an answer set. The low level classes allow direct \
manipulation of DNS zones, messages, names, and records. \
 \
The package requires dependencies necessary for these optional features: \
- DNS over HTTPS (doh) \
- IDNA \
- DNSSEC \
and suggest dependencies necessary for these optional features: \
- trio \
- curio \
This optional feature is not available due to missing dependencies: \
- wmi"
LICENSE = "ISC"

PV = "2.3.0"

RPM_NAME = "python311-dnspython-2.3.0-2.3.noarch.rpm"
RPM_HASH = "a1715dcf91cf51c74d3cb7fcc32783a0aacb39a37a884ad3761cdf6ed335ae80e96f7b33171f9c4a8da533b7d4630e7c12186e4cc92001e37fa8a1954d69837b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnspython \
python3.11dist-dnspython \
python311-dnspython \
python3dist-dnspython"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-httpx \
python311-idna \
python311-requests \
python311-requests-toolbelt"

inherit rpm
