SUMMARY = "Translations for package ddccontrol"
DESCRIPTION = "Provides translations for the 'ddccontrol' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2+20140105+git9d89d8c"

RPM_NAME = "ddccontrol-lang-0.4.2+20140105+git9d89d8c-4.14.noarch.rpm"
RPM_HASH = "2aba997113ca124c926ced70e63bfb510b925c41f88dab91fd45a245b48133d5f1d61ffb63320ece4f70350ec65f6aba3a59ea73a79e81b8b1084aff8efefdec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddccontrol-lang \
ddccontrol-lang-all \
locale(ddccontrol:de) \
locale(ddccontrol:es) \
locale(ddccontrol:fr) \
locale(ddccontrol:pl) \
locale(ddccontrol:ru) \
locale(ddccontrol:zh_CN)"
RDEPENDS:${PN} += "ddccontrol"

inherit rpm
