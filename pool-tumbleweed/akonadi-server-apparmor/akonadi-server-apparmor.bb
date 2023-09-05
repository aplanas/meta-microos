SUMMARY = "AppArmor profiles for Akonadi"
DESCRIPTION = "This package contains AppArmor profiles for Akonadi."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-server-apparmor-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e4a6291737709dd45b92a70855aa29f6e5f904409cfc77e95f5dd5122735e7d7f53745e2b26a6cf2a1b3e1da1efe852c8fac0a2fbdb3f37b71971881fc767bbf"

RPROVIDES:${PN} += "akonadi-server-apparmor \
config-akonadi-server-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions"

inherit rpm
