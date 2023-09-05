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
This optional feature is not available due to missing dependencies: \
- wmi"
LICENSE = "ISC"

PV = "2.4.2"

RPM_NAME = "python39-dnspython-2.4.2-1.1.noarch.rpm"
RPM_HASH = "04d52a4e4832d04088030531b111f6a24791a4a1694d3a8259d6db8e3951e41fc9fa7769fc0533933c2b016b5d8c4310c7b79759ccd2c11cd7ebdf8bc8377985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dnspython \
python39-dnspython \
python3dist-dnspython"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-httpx \
python39-idna"

inherit rpm
