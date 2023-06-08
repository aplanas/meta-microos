SUMMARY = "Translations for package cairo-clock"
DESCRIPTION = "Provides translations for the 'cairo-clock' package."
LICENSE = "GPL-2.0"

PV = "0.3.4"

RPM_NAME = "cairo-clock-lang-0.3.4-7.10.noarch.rpm"
RPM_HASH = "4879d6974641186163a3074905eff08b5610b99d707a05e7d2d24aae4048f2e27e18cfd681991b5d3433d8ac2e281e5b45949c61fd199283b30bd1dc7f872e61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cairo-clock-lang cairo-clock-lang-all locale(cairo-clock:da) locale(cairo-clock:de) locale(cairo-clock:en_GB) locale(cairo-clock:es) locale(cairo-clock:fi) locale(cairo-clock:fr) locale(cairo-clock:it) locale(cairo-clock:ja) locale(cairo-clock:nl) locale(cairo-clock:nn) locale(cairo-clock:pl) locale(cairo-clock:pt_PT) locale(cairo-clock:ru) locale(cairo-clock:sl) locale(cairo-clock:sv) locale(cairo-clock:tr) locale(cairo-clock:zh_CN) locale(cairo-clock:zh_TW)"
RDEPENDS:${PN} += "cairo-clock"

inherit rpm
