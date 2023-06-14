SUMMARY = "Translation Updates for Hungarian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-hu-15.1-3.1.noarch.rpm"
RPM_HASH = "128263d794971d7da895043035fc59da44a1457d9bb92b992fca011e0807597868557b5de5f3f901bc04ca62a27efba34101dde6870c203a61bbe3bd321b404a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translation-update-hu \
translation-update-hu"

RDEPENDS:${PN} += "translation-update"

inherit rpm
