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

RPM_NAME = "python39-dnspython-2.3.0-2.1.noarch.rpm"
RPM_HASH = "d3ed2a07167191646198eddb4a4598b5c01ba9cd1823d6682e1c633ad79ce1be373351bde342b5c093bbf1209ce93b5aa0e4331c2c380db9cfb8ee4d4b8dded5"
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
