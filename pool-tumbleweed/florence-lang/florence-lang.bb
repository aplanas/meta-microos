SUMMARY = "Translations for package florence"
DESCRIPTION = "Provides translations for the 'florence' package."
LICENSE = "GPL-2.0-or-later & GFDL-1.2-only"

PV = "0.6.3"

RPM_NAME = "florence-lang-0.6.3-5.11.noarch.rpm"
RPM_HASH = "3c030127fa0aa8a4a1cc6e036d6b1eaef93a8975a5cd1d1f44c26d9c8ede66fde1f7ecc56d1332b7142a9fdc7e2bbc63b96e99aaa06c0a1ac74abd0e86dad78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "florence-lang \
florence-lang-all \
locale-florence-fr \
locale-florence-it \
locale-florence-ru"

RDEPENDS:${PN} += "florence"

inherit rpm
