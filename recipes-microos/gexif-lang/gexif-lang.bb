SUMMARY = "Translations for package gexif"
DESCRIPTION = "Provides translations for the 'gexif' package."
LICENSE = "LGPL-2.1+"

PV = "0.5"

RPM_NAME = "gexif-lang-0.5-204.30.noarch.rpm"
RPM_HASH = "53c833a746a9e17f3195c3df75d32f0aa541a85aad29b252da12305c7962dfd3acd31b32248dea89dfa248cfeba42c714f06c3e2bde4d68c5cceec549c3ae157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gexif-lang gexif-lang-all locale(gexif:de) locale(gexif:es) locale(gexif:fr)"
RDEPENDS:${PN} += "gexif"

inherit rpm
