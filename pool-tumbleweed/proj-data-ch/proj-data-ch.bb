SUMMARY = "Switzerland datum grids for Proj"
DESCRIPTION = "Switzerland datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-ch-9.2.1-1.1.noarch.rpm"
RPM_HASH = "6514879ad0451d1441f730436c9368cf5d16ebf33ef14f196abf6091d7f48131deb78d3dc8aa888365d8668e96e92dd768e63d517109be9f71464d1cf8c073fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-ch"

RDEPENDS:${PN} += ""

inherit rpm
