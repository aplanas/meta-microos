SUMMARY = "Translations for package epymc"
DESCRIPTION = "Provides translations for the 'epymc' package."
LICENSE = "GPL-3.0+"

PV = "1.2.0"

RPM_NAME = "epymc-lang-1.2.0-2.18.noarch.rpm"
RPM_HASH = "544c6d63013b23a00d226857857189eec4eac408d9c207ae5530d680364d3b3ae39e95b95532f12a15d4bc365dca8acb4412a62e5944f2ae25fec72a3d369eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epymc-lang \
epymc-lang-all \
locale(epymc:de) \
locale(epymc:fi) \
locale(epymc:it) \
locale(epymc:ru)"
RDEPENDS:${PN} += "epymc"

inherit rpm
