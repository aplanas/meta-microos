SUMMARY = "Translations for package filelight"
DESCRIPTION = "Provides translations for the 'filelight' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "filelight-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "aeaab8f5f1c7a817ee10c050f96962a3e1c7e8d06cf03ae92ef86e6afffbe8f5e027cda4e14f47d718cfd14dda1c30cb35106933b2b892d9241fef7cf9c4d15b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "filelight-lang filelight-lang-all locale(filelight:ar) locale(filelight:az) locale(filelight:bg) locale(filelight:bs) locale(filelight:ca) locale(filelight:ca@valencia) locale(filelight:cs) locale(filelight:da) locale(filelight:de) locale(filelight:el) locale(filelight:en_GB) locale(filelight:eo) locale(filelight:es) locale(filelight:et) locale(filelight:eu) locale(filelight:fi) locale(filelight:fr) locale(filelight:ga) locale(filelight:gl) locale(filelight:hu) locale(filelight:ia) locale(filelight:is) locale(filelight:it) locale(filelight:ja) locale(filelight:ka) locale(filelight:kk) locale(filelight:ko) locale(filelight:lt) locale(filelight:mr) locale(filelight:nb) locale(filelight:nds) locale(filelight:nl) locale(filelight:nn) locale(filelight:pa) locale(filelight:pl) locale(filelight:pt) locale(filelight:pt_BR) locale(filelight:ro) locale(filelight:ru) locale(filelight:sk) locale(filelight:sl) locale(filelight:sr) locale(filelight:sr@ijekavian) locale(filelight:sr@ijekavianlatin) locale(filelight:sr@latin) locale(filelight:sv) locale(filelight:ta) locale(filelight:tr) locale(filelight:ug) locale(filelight:uk) locale(filelight:zh_CN) locale(filelight:zh_TW)"
RDEPENDS:${PN} += "filelight"

inherit rpm
