SUMMARY = "Translations for package kgeotag"
DESCRIPTION = "Provides translations for the 'kgeotag' package."
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "kgeotag-lang-1.3.1-2.3.noarch.rpm"
RPM_HASH = "343c3ded66768a16a49831be5fbb75e937271f3057c753c85665d71ffce5f793b1852a86fe081974a80ae86d3913d9944b97f3dc88d9362bd1ab3c8b6e82e70b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgeotag-lang \
kgeotag-lang-all \
locale(kgeotag:ca) \
locale(kgeotag:ca@valencia) \
locale(kgeotag:cs) \
locale(kgeotag:de) \
locale(kgeotag:en_GB) \
locale(kgeotag:es) \
locale(kgeotag:fi) \
locale(kgeotag:fr) \
locale(kgeotag:it) \
locale(kgeotag:ko) \
locale(kgeotag:nl) \
locale(kgeotag:nn) \
locale(kgeotag:pa) \
locale(kgeotag:pl) \
locale(kgeotag:pt) \
locale(kgeotag:pt_BR) \
locale(kgeotag:ru) \
locale(kgeotag:sk) \
locale(kgeotag:sl) \
locale(kgeotag:sv) \
locale(kgeotag:tr) \
locale(kgeotag:uk) \
locale(kgeotag:zh_CN)"
RDEPENDS:${PN} += "kgeotag"

inherit rpm
