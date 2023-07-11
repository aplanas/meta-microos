SUMMARY = "Python module for DNS (Domain Name Service)"
DESCRIPTION = "This package contains a module (dnslib) that implements a DNS \
(Domain Name Server) client, plus additional modules that define some \
symbolic constants used by DNS (dnstype, dnsclass, dnsopcode)."
LICENSE = "CNRI-Python"

PV = "3.2.1"

RPM_NAME = "python311-py3dns-3.2.1-1.14.noarch.rpm"
RPM_HASH = "dc305162c1b99e0860dd34842a40264a2086fea2f652e3ccc95ab3c2d85b908d5768010c9708ec616d20d1c0993410bdf82c86f8c785c3fbe863bfc508595bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py3dns \
python3.11dist-py3dns \
python311-py3dns \
python3dist-py3dns"

RDEPENDS:${PN} += "python-abi"

inherit rpm
