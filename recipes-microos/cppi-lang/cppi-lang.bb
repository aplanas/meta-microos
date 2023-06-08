SUMMARY = "Translations for package cppi"
DESCRIPTION = "Provides translations for the 'cppi' package."
LICENSE = "GPL-3.0+"

PV = "1.18"

RPM_NAME = "cppi-lang-1.18-2.25.noarch.rpm"
RPM_HASH = "c0d23ca196b37791beb429d55e63a13501b6987b98eb92477739efcf03049b8a597e44f59cb22cdccc0fe32684febacec2e1bd315b58d4b4a24602928f57c9b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppi-lang cppi-lang-all locale(cppi:de) locale(cppi:eo) locale(cppi:fi) locale(cppi:fr) locale(cppi:gl) locale(cppi:hr) locale(cppi:it) locale(cppi:ja) locale(cppi:pl) locale(cppi:sr) locale(cppi:sv) locale(cppi:uk) locale(cppi:vi)"
RDEPENDS:${PN} += "cppi"

inherit rpm
