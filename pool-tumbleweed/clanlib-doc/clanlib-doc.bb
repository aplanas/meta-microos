SUMMARY = "A Portable Interface for Writing Games"
DESCRIPTION = "ClanLib delivers a platform-independent interface for writing games."
LICENSE = "Zlib"

PV = "4.1.0"

RPM_NAME = "clanlib-doc-4.1.0-2.11.noarch.rpm"
RPM_HASH = "a494d5045e735ce1de6ba5c59b752793b6c1af9d0a1d6146a93146087ba27ba8e263b113b9c7157bcce23dcd35f7990692b4acbc924dcedb07b94632197089f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clanlib-doc"

RDEPENDS:${PN} += ""

inherit rpm
