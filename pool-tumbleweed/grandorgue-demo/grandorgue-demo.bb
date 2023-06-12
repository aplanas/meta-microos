SUMMARY = "GrandOrgue demo sampleset"
DESCRIPTION = "This package contains the demo sampleset for GrandOrgue."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.0"

RPM_NAME = "grandorgue-demo-3.12.0-1.1.noarch.rpm"
RPM_HASH = "1c729e1049fed1705fa8d55daa941c7a5f584a695eba270d327d6e6d59d8c030f2e18e984831674c540813c508e6fa5241cc8fe55815269d4b38ac07550cb531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grandorgue-demo"
RDEPENDS:${PN} += ""

inherit rpm
