SUMMARY = "Distributed lock manager library"
DESCRIPTION = "FLoM is a distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. \
 \
This package contains the files required to build programs with FLoM."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "flom-devel-1.6.1-1.1.aarch64.rpm"
RPM_HASH = "70035d593d6ff3e5d1cbfe3dcd33e991165bb10b9c6a99b2188fc17d0f1376213e5b665910763f9363c3b166ee03ed9003434e2b9920d3c02b5d257bdf5d784b"

RPROVIDES:${PN} += "flom-devel"

RDEPENDS:${PN} += "libflom0"

inherit rpm
