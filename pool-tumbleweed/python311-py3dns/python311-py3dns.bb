SUMMARY = "Python module for DNS (Domain Name Service)"
DESCRIPTION = "This package contains a module (dnslib) that implements a DNS \
(Domain Name Server) client, plus additional modules that define some \
symbolic constants used by DNS (dnstype, dnsclass, dnsopcode)."
LICENSE = "CNRI-Python"

PV = "3.2.1"

RPM_NAME = "python311-py3dns-3.2.1-1.13.noarch.rpm"
RPM_HASH = "8c9c77b7652d6c745b312655b5967cf20fab896c567d9efc84d940e3403499549c2cfabc6c5267bb15b213244670da748fed44ad8beb30d8b74ed514b7e8989b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-py3dns \
python311-py3dns \
python3dist-py3dns"

RDEPENDS:${PN} += "python-abi"

inherit rpm
