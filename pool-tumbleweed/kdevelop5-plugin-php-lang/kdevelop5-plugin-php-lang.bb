SUMMARY = "Translations for package kdevelop5-plugin-php"
DESCRIPTION = "Provides translations to the package kdevelop5-plugin-php"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdevelop5-plugin-php-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "3a7fac85e9e86a7161ec3cb9d8e24144472dccea38ce97faa733490f285ec508f6333e4872262b2baa79f4921cc6ac15368a6be8a0d150b2dad007f527ef3c3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdevelop5-plugin-php-lang \
kdevelop5-plugin-php-lang-all \
locale(kdevelop5-plugin-php:bs) \
locale(kdevelop5-plugin-php:ca) \
locale(kdevelop5-plugin-php:ca@valencia) \
locale(kdevelop5-plugin-php:cs) \
locale(kdevelop5-plugin-php:da) \
locale(kdevelop5-plugin-php:de) \
locale(kdevelop5-plugin-php:el) \
locale(kdevelop5-plugin-php:en_GB) \
locale(kdevelop5-plugin-php:eo) \
locale(kdevelop5-plugin-php:es) \
locale(kdevelop5-plugin-php:et) \
locale(kdevelop5-plugin-php:eu) \
locale(kdevelop5-plugin-php:fi) \
locale(kdevelop5-plugin-php:fr) \
locale(kdevelop5-plugin-php:ga) \
locale(kdevelop5-plugin-php:gl) \
locale(kdevelop5-plugin-php:hr) \
locale(kdevelop5-plugin-php:hu) \
locale(kdevelop5-plugin-php:it) \
locale(kdevelop5-plugin-php:ja) \
locale(kdevelop5-plugin-php:ka) \
locale(kdevelop5-plugin-php:kk) \
locale(kdevelop5-plugin-php:ko) \
locale(kdevelop5-plugin-php:lt) \
locale(kdevelop5-plugin-php:mr) \
locale(kdevelop5-plugin-php:nb) \
locale(kdevelop5-plugin-php:nds) \
locale(kdevelop5-plugin-php:nl) \
locale(kdevelop5-plugin-php:nn) \
locale(kdevelop5-plugin-php:pl) \
locale(kdevelop5-plugin-php:pt) \
locale(kdevelop5-plugin-php:pt_BR) \
locale(kdevelop5-plugin-php:ro) \
locale(kdevelop5-plugin-php:ru) \
locale(kdevelop5-plugin-php:sk) \
locale(kdevelop5-plugin-php:sl) \
locale(kdevelop5-plugin-php:sv) \
locale(kdevelop5-plugin-php:th) \
locale(kdevelop5-plugin-php:tr) \
locale(kdevelop5-plugin-php:ug) \
locale(kdevelop5-plugin-php:uk) \
locale(kdevelop5-plugin-php:zh_CN) \
locale(kdevelop5-plugin-php:zh_TW)"
RDEPENDS:${PN} += "kdevelop5-plugin-php"

inherit rpm
