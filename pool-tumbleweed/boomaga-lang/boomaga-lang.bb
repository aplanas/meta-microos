SUMMARY = "Translations for package boomaga"
DESCRIPTION = "Provides translations for the 'boomaga' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "boomaga-lang-3.0.0-3.12.noarch.rpm"
RPM_HASH = "dff330fc8fb77d90b0a0ff86fa05f13a404b019aa79409b4261a672b33d3bc7dde8c73576ceea5c1650fa8e5649958dac238f819a8bc4709a1fc1cf50f960645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boomaga-lang \
boomaga-lang-all"

RDEPENDS:${PN} += "boomaga"

inherit rpm
