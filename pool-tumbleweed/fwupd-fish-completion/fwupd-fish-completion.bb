SUMMARY = "Fish completion for fwupd"
DESCRIPTION = "This package contain the fish completion command for the device firmware updater daemon."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.12"

RPM_NAME = "fwupd-fish-completion-1.8.12-1.3.noarch.rpm"
RPM_HASH = "74b1f0a38c9b8cb36f75fe4be9748bc90b0775eaa182e0ebf99b15c1ca092b0a7773f72b3e6bc993bc99a4d73382eb5bc1049348f241e151f05b45be2ea59cb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-fish-completion"
RDEPENDS:${PN} += "fish \
fwupd"

inherit rpm
