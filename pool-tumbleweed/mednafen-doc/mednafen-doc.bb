SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to this package's base documentation."
LICENSE = "GPL-2.0-only"

PV = "1.31.0"

RPM_NAME = "mednafen-doc-1.31.0-1.5.noarch.rpm"
RPM_HASH = "5ed2ca6288499b35928548ddead9ab1671cc63044448fe4bb8983aff4563465d41a787a82f944cfc03abbfeb593ff6d356cf8779dff7e2886eb2d7d9546a2682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mednafen-doc"

RDEPENDS:${PN} += ""

inherit rpm
