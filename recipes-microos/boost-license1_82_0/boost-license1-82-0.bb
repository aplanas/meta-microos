SUMMARY = "Boost License"
DESCRIPTION = "This package contains the license boost is provided under."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-license1_82_0-1.82.0-1.2.noarch.rpm"
RPM_HASH = "a76b92aeacc4c4c5d95645e4d8010e51e5cf5d121db77bdb52c2bbdf0235b324bfb91a78099d6da5cd47ef263958fbae6ae85b226f2c000c3aae912a27906b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-license boost-license1_82_0"
RDEPENDS:${PN} += ""

inherit rpm
