SUMMARY = "GrandOrgue demo sampleset"
DESCRIPTION = "This package contains the demo sampleset for GrandOrgue."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.1"

RPM_NAME = "grandorgue-demo-3.12.1-1.1.noarch.rpm"
RPM_HASH = "fc8a3e6f46b241904c17b132f7ffe06d848a52109b5a26bd67f68337ad5da815c3994664c2924e32d4052621810bfb2d4242a3143b713e170f8212fbc6fe26aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grandorgue-demo"

RDEPENDS:${PN} += ""

inherit rpm
