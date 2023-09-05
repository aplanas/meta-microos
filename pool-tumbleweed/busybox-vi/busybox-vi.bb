SUMMARY = "Busybox applets replacing vim"
DESCRIPTION = "This package contains the symlinks to provide vi with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-vi-1.36.1-29.1.noarch.rpm"
RPM_HASH = "ab208cbd53c2b51e5db9e849e31357620b99c31af4e6689193eed8aa3977a5800e6a46b8d33691106ca09d72a1eb18fd40fcd967d8a202c7b54b4c9d196c8796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vi"

RDEPENDS:${PN} += "busybox"

inherit rpm
