SUMMARY = "Translations for package akonadiconsole"
DESCRIPTION = "Provides translations for the 'akonadiconsole' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadiconsole-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "6f22c81bf5dd59eb64c5fa0cb8920fa1ccf54a3d829a2abdac5e64ec3636ff0bf1b9aa0fdcf7c6aa09f6e61274eefc6bf271018406e55d2217be7f2e2ed8a892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadiconsole-lang akonadiconsole-lang-all locale(akonadiconsole:ca) locale(akonadiconsole:ca@valencia) locale(akonadiconsole:cs) locale(akonadiconsole:de) locale(akonadiconsole:en_GB) locale(akonadiconsole:es) locale(akonadiconsole:eu) locale(akonadiconsole:fi) locale(akonadiconsole:fr) locale(akonadiconsole:ia) locale(akonadiconsole:it) locale(akonadiconsole:ka) locale(akonadiconsole:lt) locale(akonadiconsole:nl) locale(akonadiconsole:pl) locale(akonadiconsole:pt) locale(akonadiconsole:ru) locale(akonadiconsole:sk) locale(akonadiconsole:sl) locale(akonadiconsole:tr) locale(akonadiconsole:uk) locale(akonadiconsole:zh_CN)"
RDEPENDS:${PN} += "akonadiconsole"

inherit rpm
