SUMMARY = "Translation Updates for Traditional Chinese"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-zh_TW-15.1-3.1.noarch.rpm"
RPM_HASH = "b59ff9b1a3f68b290eb80a96b44210122191c7b9d793e56c5cbf878981aaecb7820f2c821b76a70fc263b196305274aae77a75450f9d824c2aec4ea1158de5f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-zh-TW \
translation-update-zh-TW"

RDEPENDS:${PN} += "translation-update"

inherit rpm
