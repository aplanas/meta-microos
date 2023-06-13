SUMMARY = "Translations for package lxqt-session"
DESCRIPTION = "Provides translations for the 'lxqt-session' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-session-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "cc8f122f93e553a3d84ede08cfabcf489e6cf025746b4369d8b6b8f87e7b918e9f9eec2edfa60eb80af696931d097a1147b8844182e141ef024a2eace5d7da46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-session-lang \
lxqt-session-lang-all"

RDEPENDS:${PN} += "lxqt-session"

inherit rpm
