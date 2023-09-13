SUMMARY = "Busybox applets replacing ncurses-utils"
DESCRIPTION = "This package contains the symlinks to replace ncurses-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-ncurses-utils-1.36.1-30.1.noarch.rpm"
RPM_HASH = "2886e71d62724cb917b2eaaea6681d31eaa76f27e44202ca867c25f815c581879076be89f61d2f9b4603342a4875535ae4beee875b9dbda6306284c4aae2b873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ncurses-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
