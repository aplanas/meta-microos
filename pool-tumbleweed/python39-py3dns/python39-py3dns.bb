SUMMARY = "Python module for DNS (Domain Name Service)"
DESCRIPTION = "This package contains a module (dnslib) that implements a DNS \
(Domain Name Server) client, plus additional modules that define some \
symbolic constants used by DNS (dnstype, dnsclass, dnsopcode)."
LICENSE = "CNRI-Python"

PV = "3.2.1"

RPM_NAME = "python39-py3dns-3.2.1-1.14.noarch.rpm"
RPM_HASH = "70f173e2aba8afc8331239a825a60863b4d678b836d4caa5430f9728ac38a76ee5eecad28aaeb69f7d1365407956472adfadac3c5abb1768b0f118063e1117c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py3dns \
python39-py3dns \
python3dist-py3dns"

RDEPENDS:${PN} += "python-abi"

inherit rpm
