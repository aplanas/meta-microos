SUMMARY = "Translations for package libKPipeWire5"
DESCRIPTION = "Provides translations for the 'libKPipeWire5' package."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "libKPipeWire5-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "7b6865f95368b0e122aad7e34d5daa8cb6f39b3b1970caf4bf4fc22a5fb98b223f170e7e4c14b13625eb074188820314cfe59f6f1bf8b80174df085d86c1bec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPipeWire5-lang \
libKPipeWire5-lang-all \
locale(libKPipeWire5:ar) \
locale(libKPipeWire5:ca) \
locale(libKPipeWire5:ca@valencia) \
locale(libKPipeWire5:cs) \
locale(libKPipeWire5:de) \
locale(libKPipeWire5:en_GB) \
locale(libKPipeWire5:es) \
locale(libKPipeWire5:eu) \
locale(libKPipeWire5:fi) \
locale(libKPipeWire5:fr) \
locale(libKPipeWire5:gl) \
locale(libKPipeWire5:it) \
locale(libKPipeWire5:ja) \
locale(libKPipeWire5:ka) \
locale(libKPipeWire5:ko) \
locale(libKPipeWire5:nl) \
locale(libKPipeWire5:nn) \
locale(libKPipeWire5:pa) \
locale(libKPipeWire5:pl) \
locale(libKPipeWire5:pt) \
locale(libKPipeWire5:pt_BR) \
locale(libKPipeWire5:ro) \
locale(libKPipeWire5:ru) \
locale(libKPipeWire5:sk) \
locale(libKPipeWire5:sl) \
locale(libKPipeWire5:sv) \
locale(libKPipeWire5:ta) \
locale(libKPipeWire5:tr) \
locale(libKPipeWire5:uk) \
locale(libKPipeWire5:zh_CN) \
locale(libKPipeWire5:zh_TW)"

RDEPENDS:${PN} += "libKPipeWire5"

inherit rpm
