SUMMARY = "Translations for package florence"
DESCRIPTION = "Provides translations for the 'florence' package."
LICENSE = "GPL-2.0-or-later & GFDL-1.2-only"

PV = "0.6.3"

RPM_NAME = "florence-lang-0.6.3-5.10.noarch.rpm"
RPM_HASH = "337b20d05a5414499186d0d7ce40a565009ce0c8bbc5a0d63a2c74d5cdbc59985b54923168d75ef65b5605404965df8363b241bd436f92a3bb042ddfa2e810a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "florence-lang \
florence-lang-all \
locale(florence:fr) \
locale(florence:it) \
locale(florence:ru)"
RDEPENDS:${PN} += "florence"

inherit rpm
