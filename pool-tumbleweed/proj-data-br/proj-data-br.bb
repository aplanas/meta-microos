SUMMARY = "Brasil datum grids for Proj"
DESCRIPTION = "Brasil datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-br-9.2.0-1.3.noarch.rpm"
RPM_HASH = "27a1a101ac8989bc2e4d4ff4fe3c32aef088a5fd7865dbddfead0306b4042f85f7efe60529f3fae9faad50ceffd7053a735e4e59476610925d86c4976dee54ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-br"

RDEPENDS:${PN} += ""

inherit rpm
