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

RPM_NAME = "python310-dnspython-2.3.0-2.3.noarch.rpm"
RPM_HASH = "222ed6a3f7eef8b5681022410580dbb147cdeb861909838ee686a852b0abbaed0d7f93552ba8967f904e6743792e940c2fd2af0fcc18e347f7833fed24765061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dnspython \
python310-dnspython \
python3dist-dnspython"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-httpx \
python310-idna \
python310-requests \
python310-requests-toolbelt"

inherit rpm
