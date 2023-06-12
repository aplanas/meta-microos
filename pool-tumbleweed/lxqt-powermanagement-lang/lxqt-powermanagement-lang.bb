SUMMARY = "Translations for package lxqt-powermanagement"
DESCRIPTION = "Provides translations for the 'lxqt-powermanagement' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-powermanagement-lang-1.3.0-1.3.noarch.rpm"
RPM_HASH = "0ea173a5c027f21da4051f22279a11d131e35a59018a63df6da0f66f6d14c9defc6c2603d915ea25f4e881d1d288ddf366a6eaa38bc63785782cb652ad9bf168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-powermanagement-lang \
lxqt-powermanagement-lang-all"
RDEPENDS:${PN} += "lxqt-powermanagement"

inherit rpm
