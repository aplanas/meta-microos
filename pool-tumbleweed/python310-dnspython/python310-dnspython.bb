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

RPM_NAME = "python310-dnspython-2.4.2-1.1.noarch.rpm"
RPM_HASH = "9d58be99e17b71d4e187faf9d55c3fc04f52879e343af6f06f140cf00cedc02c63d9bcc364e8521c719307f7004925b9b71113014c23a9cea273d8d2c56a387c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dnspython \
python310-dnspython \
python3dist-dnspython"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-httpx \
python310-idna"

inherit rpm
