SUMMARY = "Translation Updates for Finnish"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-fi-15.1-3.1.noarch.rpm"
RPM_HASH = "18c6631b4e50dbf8292daf10b83af44a4dce5b9651773fe316f3e740c6f75d8f84a47d1da7bb55c86cd3d1df1a45312cab164cdbeacffda3fa6a73b45f02d176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-fi \
translation-update-fi"

RDEPENDS:${PN} += "translation-update"

inherit rpm
