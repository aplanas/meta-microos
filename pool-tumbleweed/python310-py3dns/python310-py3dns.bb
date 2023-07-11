SUMMARY = "Python module for DNS (Domain Name Service)"
DESCRIPTION = "This package contains a module (dnslib) that implements a DNS \
(Domain Name Server) client, plus additional modules that define some \
symbolic constants used by DNS (dnstype, dnsclass, dnsopcode)."
LICENSE = "CNRI-Python"

PV = "3.2.1"

RPM_NAME = "python310-py3dns-3.2.1-1.14.noarch.rpm"
RPM_HASH = "650414844cb548564b1cda596844c1dc10ad7201f459c276908291b8496caab5a04881403c4eac323191e4991afdff0e904d31f5f4467c70d3fce6bed318ba9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py3dns \
python310-py3dns \
python3dist-py3dns"

RDEPENDS:${PN} += "python-abi"

inherit rpm
