SUMMARY = "Busybox applets replacing vim"
DESCRIPTION = "This package contains the symlinks to provide vi with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-vi-1.36.1-27.1.noarch.rpm"
RPM_HASH = "af5e874f5d2ee56337d0a0c2184a852c5a2dc390a0fa1a8348815246c404bc7df445aa21d1252d6d5b3ad7d27b4c862f715df3c28dde2e04720958674a51ce7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vi"

RDEPENDS:${PN} += "busybox"

inherit rpm
