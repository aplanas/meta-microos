SUMMARY = "Translations for package DVDStyler"
DESCRIPTION = "Provides translations for the 'DVDStyler' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "DVDStyler-lang-3.2.1-2.5.noarch.rpm"
RPM_HASH = "8711ae9deb8709f0cd1765d5e680b4c5da50b4cbdde9fc8c1a5555d3e3e26fa417cf0998f70702efe439cd86222b4bcc54511871d0526eb6e9e5ef83bcc06f26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "DVDStyler-lang DVDStyler-lang-all locale(DVDStyler:ar) locale(DVDStyler:bg) locale(DVDStyler:ca) locale(DVDStyler:cs) locale(DVDStyler:da) locale(DVDStyler:de) locale(DVDStyler:el) locale(DVDStyler:es) locale(DVDStyler:eu) locale(DVDStyler:fi) locale(DVDStyler:fr) locale(DVDStyler:hu) locale(DVDStyler:it) locale(DVDStyler:ja) locale(DVDStyler:ko) locale(DVDStyler:mk) locale(DVDStyler:nb) locale(DVDStyler:nl) locale(DVDStyler:pl) locale(DVDStyler:pt) locale(DVDStyler:pt_BR) locale(DVDStyler:ro) locale(DVDStyler:ru) locale(DVDStyler:si) locale(DVDStyler:sk) locale(DVDStyler:sl) locale(DVDStyler:sr) locale(DVDStyler:sv) locale(DVDStyler:tr) locale(DVDStyler:uk) locale(DVDStyler:vi) locale(DVDStyler:zh_CN) locale(DVDStyler:zh_TW)"
RDEPENDS:${PN} += "DVDStyler"

inherit rpm
