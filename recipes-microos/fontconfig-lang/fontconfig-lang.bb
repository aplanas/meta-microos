SUMMARY = "Translations for package fontconfig"
DESCRIPTION = "Provides translations for the 'fontconfig' package."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "fontconfig-lang-2.14.2-1.3.noarch.rpm"
RPM_HASH = "23364b65cf310bcedb4e2d5580ce55ed3b3545bb1b60c93fd43a4409bbb61164ef2698f9c73c7cec4d5caa77da34587db5947ac2e699bbf8015e9bc1d7288eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontconfig-lang fontconfig-lang-all locale(fontconfig:ka) locale(fontconfig:zh_CN)"
RDEPENDS:${PN} += "fontconfig"

inherit rpm
