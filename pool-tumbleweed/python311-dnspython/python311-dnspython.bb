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

RPM_NAME = "python311-dnspython-2.4.2-1.1.noarch.rpm"
RPM_HASH = "530bcd8aac411575350daaa2550283516d601dd041697318f04818eb89c345f312ef3ff8f38e9c478fcefbdb856e750c95b45bcfc6da5f360cf899ce2723ca88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnspython \
python3.11dist-dnspython \
python311-dnspython \
python3dist-dnspython"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-httpx \
python311-idna"

inherit rpm
