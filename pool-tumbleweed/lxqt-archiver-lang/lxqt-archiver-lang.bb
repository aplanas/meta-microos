SUMMARY = "Translations for package lxqt-archiver"
DESCRIPTION = "Provides translations for the 'lxqt-archiver' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "lxqt-archiver-lang-0.8.0-1.2.noarch.rpm"
RPM_HASH = "044da6036bfe46cbdefb4af4dbaaef2a75a69dc6067b2143bc136bbdb493447f0f9f3b1373cef2452ca674cf2682c039ac6c47e6814e7dd29ccefc2be2d8aee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-archiver-lang \
lxqt-archiver-lang-all"

RDEPENDS:${PN} += "lxqt-archiver"

inherit rpm
