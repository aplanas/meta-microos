SUMMARY = "Manual pages for librmt functions"
DESCRIPTION = "This subpackage contains the manual pages for librmt's functions."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "librmt-devel-doc-2022.10.16-47.3.noarch.rpm"
RPM_HASH = "a29b4dc9c0a900e26749a5cb8a1d2ffa6be9c8add5d90bf46c1f5dd3f515c17fd0b2afa686f12680dd5d53064e5d6e4ab8f5a28ab76b9dd2b3d75526088cdc33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librmt-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
