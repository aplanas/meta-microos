SUMMARY = "Translations for package libKPim5CalendarSupport5"
DESCRIPTION = "Provides translations for the 'libKPim5CalendarSupport5' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5CalendarSupport5-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "bd5a4d7d9a6c4b3894f70fb374a45a17645eea32ad6b308337f7df54b0d2b86a18b24d9abadd6d8946836a12e051f1e77282346ba8d3628c016b2db08550ddaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5CalendarSupport5-lang \
libKPim5CalendarSupport5-lang-all \
locale(libKPim5CalendarSupport5:af) \
locale(libKPim5CalendarSupport5:ar) \
locale(libKPim5CalendarSupport5:az) \
locale(libKPim5CalendarSupport5:be) \
locale(libKPim5CalendarSupport5:bg) \
locale(libKPim5CalendarSupport5:br) \
locale(libKPim5CalendarSupport5:bs) \
locale(libKPim5CalendarSupport5:ca) \
locale(libKPim5CalendarSupport5:ca@valencia) \
locale(libKPim5CalendarSupport5:cs) \
locale(libKPim5CalendarSupport5:cy) \
locale(libKPim5CalendarSupport5:da) \
locale(libKPim5CalendarSupport5:de) \
locale(libKPim5CalendarSupport5:el) \
locale(libKPim5CalendarSupport5:en_GB) \
locale(libKPim5CalendarSupport5:eo) \
locale(libKPim5CalendarSupport5:es) \
locale(libKPim5CalendarSupport5:et) \
locale(libKPim5CalendarSupport5:eu) \
locale(libKPim5CalendarSupport5:fa) \
locale(libKPim5CalendarSupport5:fi) \
locale(libKPim5CalendarSupport5:fr) \
locale(libKPim5CalendarSupport5:ga) \
locale(libKPim5CalendarSupport5:gl) \
locale(libKPim5CalendarSupport5:he) \
locale(libKPim5CalendarSupport5:hi) \
locale(libKPim5CalendarSupport5:hr) \
locale(libKPim5CalendarSupport5:hu) \
locale(libKPim5CalendarSupport5:ia) \
locale(libKPim5CalendarSupport5:id) \
locale(libKPim5CalendarSupport5:is) \
locale(libKPim5CalendarSupport5:it) \
locale(libKPim5CalendarSupport5:ja) \
locale(libKPim5CalendarSupport5:ka) \
locale(libKPim5CalendarSupport5:kk) \
locale(libKPim5CalendarSupport5:km) \
locale(libKPim5CalendarSupport5:ko) \
locale(libKPim5CalendarSupport5:lt) \
locale(libKPim5CalendarSupport5:lv) \
locale(libKPim5CalendarSupport5:mai) \
locale(libKPim5CalendarSupport5:mk) \
locale(libKPim5CalendarSupport5:mr) \
locale(libKPim5CalendarSupport5:ms) \
locale(libKPim5CalendarSupport5:nb) \
locale(libKPim5CalendarSupport5:nds) \
locale(libKPim5CalendarSupport5:ne) \
locale(libKPim5CalendarSupport5:nl) \
locale(libKPim5CalendarSupport5:nn) \
locale(libKPim5CalendarSupport5:pa) \
locale(libKPim5CalendarSupport5:pl) \
locale(libKPim5CalendarSupport5:pt) \
locale(libKPim5CalendarSupport5:pt_BR) \
locale(libKPim5CalendarSupport5:ro) \
locale(libKPim5CalendarSupport5:ru) \
locale(libKPim5CalendarSupport5:si) \
locale(libKPim5CalendarSupport5:sk) \
locale(libKPim5CalendarSupport5:sl) \
locale(libKPim5CalendarSupport5:sq) \
locale(libKPim5CalendarSupport5:sr) \
locale(libKPim5CalendarSupport5:sr@ijekavian) \
locale(libKPim5CalendarSupport5:sr@ijekavianlatin) \
locale(libKPim5CalendarSupport5:sr@latin) \
locale(libKPim5CalendarSupport5:sv) \
locale(libKPim5CalendarSupport5:ta) \
locale(libKPim5CalendarSupport5:th) \
locale(libKPim5CalendarSupport5:tr) \
locale(libKPim5CalendarSupport5:ug) \
locale(libKPim5CalendarSupport5:uk) \
locale(libKPim5CalendarSupport5:wa) \
locale(libKPim5CalendarSupport5:zh_CN) \
locale(libKPim5CalendarSupport5:zh_TW)"

RDEPENDS:${PN} += "libKPim5CalendarSupport5"

inherit rpm
