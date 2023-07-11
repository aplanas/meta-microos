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

RPM_NAME = "python39-dnspython-2.3.0-2.3.noarch.rpm"
RPM_HASH = "fd6c05c527334cab580c4094462b51b8ccfadefdf7f4e21a1a999d00b207485efa856f032e421729baf7d90f795996a8dcda67210e893479021dbc0f7e660062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dnspython \
python39-dnspython \
python3dist-dnspython"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-httpx \
python39-idna \
python39-requests \
python39-requests-toolbelt"

inherit rpm
