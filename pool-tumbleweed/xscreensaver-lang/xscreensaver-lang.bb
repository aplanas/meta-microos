SUMMARY = "Translations for package xscreensaver"
DESCRIPTION = "Provides translations for the 'xscreensaver' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.06"

RPM_NAME = "xscreensaver-lang-6.06-4.3.noarch.rpm"
RPM_HASH = "af5e7e131e00f7456a74532a20e1530abbb189da31591adcdb5a809ca9687284809f354dd5cb8a3676b49bd367eb96a06ef291cf77ce32fbf8ca372fe2cec5ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xscreensaver:da) \
locale(xscreensaver:de) \
locale(xscreensaver:es) \
locale(xscreensaver:et) \
locale(xscreensaver:fi) \
locale(xscreensaver:fr) \
locale(xscreensaver:hu) \
locale(xscreensaver:it) \
locale(xscreensaver:ja) \
locale(xscreensaver:ko) \
locale(xscreensaver:nb) \
locale(xscreensaver:nl) \
locale(xscreensaver:pl) \
locale(xscreensaver:pt) \
locale(xscreensaver:pt_BR) \
locale(xscreensaver:ru) \
locale(xscreensaver:sk) \
locale(xscreensaver:sv) \
locale(xscreensaver:vi) \
locale(xscreensaver:wa) \
locale(xscreensaver:zh_CN) \
locale(xscreensaver:zh_TW) \
xscreensaver-lang \
xscreensaver-lang-all"
RDEPENDS:${PN} += "xscreensaver"

inherit rpm
