SUMMARY = "Translations for package csound"
DESCRIPTION = "Provides translations for the 'csound' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-lang-6.18.1-3.1.noarch.rpm"
RPM_HASH = "ad2be19e6679f9cb01f22437a2133772d2c49d5ee20159653fde8c30df5333032c9e76103f3bae25a9a40f2c3ef63dc0a1c94d4c869b269b625fe31a7bafc979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "csound-lang csound-lang-all locale(csound:de) locale(csound:en_US) locale(csound:es) locale(csound:es_CO) locale(csound:fr) locale(csound:it) locale(csound:ru)"
RDEPENDS:${PN} += "csound"

inherit rpm
