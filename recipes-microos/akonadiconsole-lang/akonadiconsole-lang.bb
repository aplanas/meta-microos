SUMMARY = "Translations for package akonadiconsole"
DESCRIPTION = "Provides translations for the 'akonadiconsole' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadiconsole-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "592be7da8f27038549272ba187062cee9a80d299731b2b1e871b02d3c77b3749821de5aa323bc413b1cebab922963e764474e93290b24fe3a6b4ae00e79f2f8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadiconsole-lang akonadiconsole-lang-all locale(akonadiconsole:ca) locale(akonadiconsole:ca@valencia) locale(akonadiconsole:cs) locale(akonadiconsole:de) locale(akonadiconsole:en_GB) locale(akonadiconsole:es) locale(akonadiconsole:eu) locale(akonadiconsole:fi) locale(akonadiconsole:fr) locale(akonadiconsole:ia) locale(akonadiconsole:it) locale(akonadiconsole:ka) locale(akonadiconsole:ko) locale(akonadiconsole:lt) locale(akonadiconsole:nl) locale(akonadiconsole:pl) locale(akonadiconsole:pt) locale(akonadiconsole:ru) locale(akonadiconsole:sk) locale(akonadiconsole:sl) locale(akonadiconsole:tr) locale(akonadiconsole:uk) locale(akonadiconsole:zh_CN)"
RDEPENDS:${PN} += "akonadiconsole"

inherit rpm
