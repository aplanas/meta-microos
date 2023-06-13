SUMMARY = "Translations for package vorbis-tools"
DESCRIPTION = "Provides translations for the 'vorbis-tools' package."
LICENSE = "GPL-2.0-only"

PV = "1.4.2"

RPM_NAME = "vorbis-tools-lang-1.4.2-1.11.noarch.rpm"
RPM_HASH = "52da11f904e713a00772e5e4f7ccd7c5ee5d2aa433828933b34bfd096106bca97df777df42740969218ebff71140f7b5382d93f09432aaf22827f0e35a99b1f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(vorbis-tools:be) \
locale(vorbis-tools:cs) \
locale(vorbis-tools:da) \
locale(vorbis-tools:en_GB) \
locale(vorbis-tools:eo) \
locale(vorbis-tools:es) \
locale(vorbis-tools:fr) \
locale(vorbis-tools:hr) \
locale(vorbis-tools:hu) \
locale(vorbis-tools:nl) \
locale(vorbis-tools:pl) \
locale(vorbis-tools:ro) \
locale(vorbis-tools:ru) \
locale(vorbis-tools:sk) \
locale(vorbis-tools:sv) \
locale(vorbis-tools:uk) \
locale(vorbis-tools:vi) \
vorbis-tools-lang \
vorbis-tools-lang-all"

RDEPENDS:${PN} += "vorbis-tools"

inherit rpm
