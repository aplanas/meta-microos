SUMMARY = "Galois Groups 8-11 for the PARI CAS"
DESCRIPTION = "This package is needed by the 'polgalois' function in the PARI CAS to \
compute Galois group in degrees 8 through 11."
LICENSE = "GPL-2.0-or-later"

PV = "20080411"

RPM_NAME = "pari-galdata-20080411-10.3.noarch.rpm"
RPM_HASH = "fa18c8a28ee87eec33f4a84748eecbde27d6e543bcc71bdaa8176f0e03d8fe17be65cb0ad0ff7f6ed3c50c463ab3767b18b8a1fec94a0dba16aa0e75a5099860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-galdata"
RDEPENDS:${PN} += ""

inherit rpm
