SUMMARY = "Translations for package libgsasl"
DESCRIPTION = "Provides translations for the 'libgsasl' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libgsasl-lang-1.10.0-6.1.noarch.rpm"
RPM_HASH = "56424fff4b2d30c59b85d4c51c50625902890e51c98169885ce0ed6c282cd07a68dab1d46cecb20470c9d41722a0c652e89762aef348eb5805893f4ed1dbeebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgsasl-lang \
libgsasl-lang-all \
locale(libgsasl:da) \
locale(libgsasl:de) \
locale(libgsasl:en@boldquot) \
locale(libgsasl:en@quot) \
locale(libgsasl:eo) \
locale(libgsasl:es) \
locale(libgsasl:fi) \
locale(libgsasl:fr) \
locale(libgsasl:ga) \
locale(libgsasl:hu) \
locale(libgsasl:id) \
locale(libgsasl:it) \
locale(libgsasl:nl) \
locale(libgsasl:pl) \
locale(libgsasl:pt_BR) \
locale(libgsasl:ro) \
locale(libgsasl:sk) \
locale(libgsasl:sr) \
locale(libgsasl:sv) \
locale(libgsasl:uk) \
locale(libgsasl:vi) \
locale(libgsasl:zh_CN)"
RDEPENDS:${PN} += "libgsasl"

inherit rpm
