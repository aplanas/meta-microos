SUMMARY = "Utilities to create a whatis database"
DESCRIPTION = "The man system in SUSE Linux (package man) does not need a whatis \
database. Nevertheless, some manual browsers, such as tkman, still need \
such a database."
LICENSE = "GPL-2.0-or-later"

PV = "2009.6.17"

RPM_NAME = "makewhat-2009.6.17-24.10.noarch.rpm"
RPM_HASH = "ae80e8a155f00658bcfb8f338e3a9ca25fbad75a6b78fd43e05b0e22b292e74c58c9d8aa19c763cd7b2761af562ab2dd4dc08c56dfcab6d9761456e7c6c420ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-makewhat \
makewhat"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
man \
update-alternatives"

inherit rpm
