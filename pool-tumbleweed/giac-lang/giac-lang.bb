SUMMARY = "Translations for package giac"
DESCRIPTION = "Provides translations for the 'giac' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "giac-lang-1.9.0.27-4.5.noarch.rpm"
RPM_HASH = "8728f8e30580ed3517dc75d7389985b53f5aa6b7dd507b986504b8775b24499a455726e63cd6c7bee2548b53007ca5f7d1cc7b333d371da1318f6b8f7af6b74b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "giac-lang \
giac-lang-all \
locale(giac:de) \
locale(giac:el) \
locale(giac:en) \
locale(giac:es) \
locale(giac:fr) \
locale(giac:it) \
locale(giac:pt) \
locale(giac:zh)"

RDEPENDS:${PN} += "giac"

inherit rpm
