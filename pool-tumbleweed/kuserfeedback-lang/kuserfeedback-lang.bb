SUMMARY = "Translations for package kuserfeedback"
DESCRIPTION = "Provides translations for the 'kuserfeedback' package."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "kuserfeedback-lang-1.2.0-1.14.noarch.rpm"
RPM_HASH = "e9a23a0d304ba4835c6e2d52d4f1abd4e9e2be7258bcf2344487b9464754fae39868f53f48dac025dcaa94d4a21f2f84f87ca18b1f7478b48d6e19632ef10de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kuserfeedback-lang \
kuserfeedback-lang-all \
locale(kuserfeedback:ar) \
locale(kuserfeedback:az) \
locale(kuserfeedback:ca) \
locale(kuserfeedback:ca@valencia) \
locale(kuserfeedback:cs) \
locale(kuserfeedback:da) \
locale(kuserfeedback:de) \
locale(kuserfeedback:en_GB) \
locale(kuserfeedback:es) \
locale(kuserfeedback:et) \
locale(kuserfeedback:fi) \
locale(kuserfeedback:fr) \
locale(kuserfeedback:gl) \
locale(kuserfeedback:ia) \
locale(kuserfeedback:it) \
locale(kuserfeedback:ja) \
locale(kuserfeedback:ko) \
locale(kuserfeedback:lt) \
locale(kuserfeedback:nl) \
locale(kuserfeedback:nn) \
locale(kuserfeedback:pl) \
locale(kuserfeedback:pt) \
locale(kuserfeedback:pt_BR) \
locale(kuserfeedback:ru) \
locale(kuserfeedback:sk) \
locale(kuserfeedback:sl) \
locale(kuserfeedback:sv) \
locale(kuserfeedback:tr) \
locale(kuserfeedback:uk) \
locale(kuserfeedback:zh_CN) \
locale(kuserfeedback:zh_TW)"

RDEPENDS:${PN} += "kuserfeedback"

inherit rpm
