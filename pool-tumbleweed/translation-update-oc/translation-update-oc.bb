SUMMARY = "Translation Updates for Occitan"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-oc-15.1-3.1.noarch.rpm"
RPM_HASH = "690fadd48dee96870b4ed7687632f1dccd63835fdf8d7549c33de681105b30694f9f7add2c2347f6c29a690c2d5540ab418f5aee70b6e9bfb640c8af86386105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:oc) \
translation-update-oc"

RDEPENDS:${PN} += "translation-update"

inherit rpm
