SUMMARY = "Translations for package gpa"
DESCRIPTION = "Provides translations for the 'gpa' package."
LICENSE = "GPL-3.0-only"

PV = "0.10.0"

RPM_NAME = "gpa-lang-0.10.0-2.16.noarch.rpm"
RPM_HASH = "51d3c505ea52acd2b2de24e5910362beeed4101e0a0dd8186eb3a1f3d00acac6199375dfc3f2ebe542a4bfc60dd3af37f2f9b6f65ff65a18a0beceeab048a77a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpa-lang \
gpa-lang-all \
locale(gpa:ar) \
locale(gpa:cs) \
locale(gpa:de) \
locale(gpa:es) \
locale(gpa:fr) \
locale(gpa:ja) \
locale(gpa:nl) \
locale(gpa:pl) \
locale(gpa:pt_BR) \
locale(gpa:ru) \
locale(gpa:sv) \
locale(gpa:tr) \
locale(gpa:zh_CN) \
locale(gpa:zh_TW)"

RDEPENDS:${PN} += "gpa"

inherit rpm
