SUMMARY = "Python module for DNS (Domain Name Service)"
DESCRIPTION = "This package contains a module (dnslib) that implements a DNS \
(Domain Name Server) client, plus additional modules that define some \
symbolic constants used by DNS (dnstype, dnsclass, dnsopcode)."
LICENSE = "CNRI-Python"

PV = "3.2.1"

RPM_NAME = "python39-py3dns-3.2.1-1.13.noarch.rpm"
RPM_HASH = "aeac770d4bb941c8a350145c59af47cef664f61c5a10d993d64a976d698c9b03584a282861dc4854c736317fbbf233f629826359d76afc17e51c4a8a9b6b4ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(py3dns) \
python39-py3dns \
python3dist(py3dns)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
