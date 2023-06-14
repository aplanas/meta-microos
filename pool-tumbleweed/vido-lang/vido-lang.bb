SUMMARY = "Translations for package vido"
DESCRIPTION = "Provides translations for the 'vido' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "vido-lang-2.3.0-1.13.noarch.rpm"
RPM_HASH = "759e6ea495c8449ecbeef67b4f8a7aa8753e4474df35fc0795a833f8d040cea19e885d5cadff976ac3e7098bf11861b416effe99a8f05c0e46d8b4f586d3bebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vido-es \
locale-vido-fr \
locale-vido-id \
locale-vido-it \
locale-vido-ja \
locale-vido-lt \
locale-vido-nl \
locale-vido-ru \
vido-lang \
vido-lang-all"

RDEPENDS:${PN} += "vido"

inherit rpm
