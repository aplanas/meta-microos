SUMMARY = "System user and group games"
DESCRIPTION = "This package provides the system account and group 'games'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-games-20170617-24.16.noarch.rpm"
RPM_HASH = "929d98763ba709cd7423b589d2ef63f16d4a36f82047d55308a5f4bb64a61d22316bc04cd3c5090af58badd621487a1fa969a208d00564444a798aa948fabfe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-games \
system-user-games \
user-games"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
