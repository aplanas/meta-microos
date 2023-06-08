SUMMARY = "Translations for package drawing"
DESCRIPTION = "Provides translations for the 'drawing' package."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "drawing-lang-1.0.2-1.1.noarch.rpm"
RPM_HASH = "e312a83f2eaf71d5087854ecfb680b0eaa44460925ed27afff3b9b5f4ee47166d77536734015b80e904cf51b337c07b293ef965e9baa2726f6f2db5b1312aab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drawing-lang drawing-lang-all locale(drawing:ca) locale(drawing:cs) locale(drawing:da) locale(drawing:de) locale(drawing:es) locale(drawing:eu) locale(drawing:fi) locale(drawing:fr) locale(drawing:he) locale(drawing:hi) locale(drawing:hr) locale(drawing:hu) locale(drawing:id) locale(drawing:it) locale(drawing:ja) locale(drawing:ko) locale(drawing:nl) locale(drawing:oc) locale(drawing:pl) locale(drawing:pt_BR) locale(drawing:ru) locale(drawing:sv) locale(drawing:tr) locale(drawing:zh_CN) locale(drawing:zh_TW)"
RDEPENDS:${PN} += "drawing"

inherit rpm
