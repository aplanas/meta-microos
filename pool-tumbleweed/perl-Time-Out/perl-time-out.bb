SUMMARY = "Easily timeout long running operations"
DESCRIPTION = "'Time::Out' provides an easy interface to _alarm(2)_ based timeouts. Nested \
timeouts are supported."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Time-Out-0.11-3.28.noarch.rpm"
RPM_HASH = "8b54e5762cec80e345bef7238a43d551196466f4f7b402ac7103fc783b75ea800c8d0029d3139616b12456fc38728a08d8bc37c9bf47bdc8ffb1389122a0a5e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Out \
perl-Time-Out"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
