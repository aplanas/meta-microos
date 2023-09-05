SUMMARY = "Busybox applets replacing tftp"
DESCRIPTION = "This package contains the symlinks to provide tftp with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tftp-1.36.1-29.1.noarch.rpm"
RPM_HASH = "499cc8ecd565e090893dba601a4113846a1939ca5e3af9e54ba96efa48bc5bd20ab734b55f86b57b43ff0ed48f65ca53d63f0c8354bae4379428d9e59782cf8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tftp"

RDEPENDS:${PN} += "busybox"

inherit rpm
