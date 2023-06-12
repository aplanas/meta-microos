SUMMARY = "Documentation for gnubg"
DESCRIPTION = "Manual for GNU Backgammon. See description of gnubg for more details."
LICENSE = "GFDL-1.3-only"

PV = "1.06.002"

RPM_NAME = "gnubg-doc-1.06.002-3.4.noarch.rpm"
RPM_HASH = "86e1e9caf22d79b53db08f0a5c1449a6c9d7776f9607e4e476470348d8eb3bf965c7b2d7cecd8485ada21dcf57136358ef675ae56faa00b1d23b76a9bbd0af2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-doc"
RDEPENDS:${PN} += ""

inherit rpm
