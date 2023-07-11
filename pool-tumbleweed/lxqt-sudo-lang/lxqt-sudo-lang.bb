SUMMARY = "Translations for package lxqt-sudo"
DESCRIPTION = "Provides translations for the 'lxqt-sudo' package."
LICENSE = "LGPL-2.1-only"

PV = "1.3.0"

RPM_NAME = "lxqt-sudo-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "f127e5de3853067cd3c39592a50962fe9413c16eae10bec1b8e6ed86b8da0612fd5da94c2145ee23f3138044593e5f9209de145703f281b4bf98a3c9c3f08e4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-sudo-lang \
lxqt-sudo-lang-all"

RDEPENDS:${PN} += "lxqt-sudo"

inherit rpm
