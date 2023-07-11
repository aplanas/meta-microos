SUMMARY = "Translations for package lxqt-globalkeys"
DESCRIPTION = "Provides translations for the 'lxqt-globalkeys' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-globalkeys-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "a8d187ac20123e6b97f68828fbb54ddb64a5928beb21be98e9bfe94e18dd8382ef3e165a8c7ad55b19b2afc6739ab307954f9c8c0352ec8d5f0d0c39c7004202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-globalkeys-lang \
lxqt-globalkeys-lang-all"

RDEPENDS:${PN} += "lxqt-globalkeys"

inherit rpm
