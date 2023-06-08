SUMMARY = "Boost License"
DESCRIPTION = "This package contains the license boost is provided under."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-license1_82_0-1.82.0-1.1.noarch.rpm"
RPM_HASH = "2540f252481c84da8400b5d6a6888e7bef60c4786c42aee3c9ea47a9136600c70c0d8f86cbca0aee25230b53fb67c0aed6294b7eb3135b1a8731de5baf5ff747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-license boost-license1_82_0"
RDEPENDS:${PN} += ""

inherit rpm
