SUMMARY = "Nautilus overlay icons"
DESCRIPTION = "This package provides overlay icons to visualize the synchronization state \
in the Nautilus file manager."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "owncloud-client-nautilus-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "d4d550604b16e0ee50538fad4034b5482d93c41aced72dfa710e257dce9b58d7344932c14598fde3b64b254d041e22b6889539aa5f6c639d1e2db5d9982550ed"

RPROVIDES:${PN} += "owncloud-client-nautilus"

RDEPENDS:${PN} += "nautilus \
owncloud-client \
python3-nautilus"

inherit rpm
