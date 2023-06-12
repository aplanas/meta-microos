SUMMARY = "Translations for package libKPim5EventViews5"
DESCRIPTION = "Provides translations for the 'libKPim5EventViews5' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5EventViews5-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "97b2b8c3e0e3b2fe7bfd6675f2352ad6108cccc21db8c2ad6834e1d41d6202abd281323e98ecbf7c893438926912ac171a5386faff0dcf2c86ea1a12c1a1ee67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5EventViews5-lang \
libKPim5EventViews5-lang-all \
locale(libKPim5EventViews5:ar) \
locale(libKPim5EventViews5:bg) \
locale(libKPim5EventViews5:bs) \
locale(libKPim5EventViews5:ca) \
locale(libKPim5EventViews5:ca@valencia) \
locale(libKPim5EventViews5:cs) \
locale(libKPim5EventViews5:da) \
locale(libKPim5EventViews5:de) \
locale(libKPim5EventViews5:el) \
locale(libKPim5EventViews5:en_GB) \
locale(libKPim5EventViews5:eo) \
locale(libKPim5EventViews5:es) \
locale(libKPim5EventViews5:et) \
locale(libKPim5EventViews5:eu) \
locale(libKPim5EventViews5:fi) \
locale(libKPim5EventViews5:fr) \
locale(libKPim5EventViews5:ga) \
locale(libKPim5EventViews5:gl) \
locale(libKPim5EventViews5:hu) \
locale(libKPim5EventViews5:ia) \
locale(libKPim5EventViews5:it) \
locale(libKPim5EventViews5:ja) \
locale(libKPim5EventViews5:ka) \
locale(libKPim5EventViews5:kk) \
locale(libKPim5EventViews5:ko) \
locale(libKPim5EventViews5:lt) \
locale(libKPim5EventViews5:mr) \
locale(libKPim5EventViews5:nb) \
locale(libKPim5EventViews5:nds) \
locale(libKPim5EventViews5:nl) \
locale(libKPim5EventViews5:pa) \
locale(libKPim5EventViews5:pl) \
locale(libKPim5EventViews5:pt) \
locale(libKPim5EventViews5:pt_BR) \
locale(libKPim5EventViews5:ro) \
locale(libKPim5EventViews5:ru) \
locale(libKPim5EventViews5:sk) \
locale(libKPim5EventViews5:sl) \
locale(libKPim5EventViews5:sv) \
locale(libKPim5EventViews5:ta) \
locale(libKPim5EventViews5:tr) \
locale(libKPim5EventViews5:ug) \
locale(libKPim5EventViews5:uk) \
locale(libKPim5EventViews5:zh_CN) \
locale(libKPim5EventViews5:zh_TW)"
RDEPENDS:${PN} += "libKPim5EventViews5"

inherit rpm
