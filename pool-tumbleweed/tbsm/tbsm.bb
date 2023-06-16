SUMMARY = "A pure bash session or application launcher"
DESCRIPTION = "tbsm is an application or session launcher, written in pure bash with no ncurses or dialog dependencies. It is inspired by cdm, tdm, in some way by krunner and related."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "tbsm-0.7-1.2.noarch.rpm"
RPM_HASH = "59f918adfe5bb7255adea6bdf794c2aa50d99f68d68faf83188a6010c09c4fcc4dcf6b2f3ebafc8fd9ccd73fe1d2c6e2f3b1997b24a2a34674c24165e9210a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tbsm \
tbsm"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
