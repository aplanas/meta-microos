SUMMARY = "Weblate Documentation"
DESCRIPTION = "HTML documentation files for the Weblate collaborative web translation tool."
LICENSE = "GPL-3.0-or-later"

PV = "4.14.2"

RPM_NAME = "weblate-doc-4.14.2-3.1.noarch.rpm"
RPM_HASH = "9af9d7195019adbece73d9413d326fb9c8461653eddb9a97cc7314531831a06b74751459320013b4e7e0fa37aab0823d06b5f876f40d0c010452a1e87ddb741c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weblate-doc"

RDEPENDS:${PN} += ""

inherit rpm
