SUMMARY = "YaST2 - Galician Translations"
DESCRIPTION = "YaST2 - Galician translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-gl-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "6b2ce3f3f2bdf30126b483aaecdeff984caaafac366bb04b1acae233ce8baf158600f94569261b8b9767c24fb8d4df6c116b1466e5ef4415ed9f4058f32cf3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gl \
yast2-trans-gl"

RDEPENDS:${PN} += ""

inherit rpm
