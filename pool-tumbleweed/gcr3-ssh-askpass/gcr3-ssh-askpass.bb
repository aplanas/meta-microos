SUMMARY = "SSH password callback helper for gcr"
DESCRIPTION = "gcr-ssh-askpass allows an ssh command to callback for a password."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-ssh-askpass-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "6b8b3efd6223edff938b09a0706f4a50dbe7a74cd1e061fa3d2dffd8bce243cbb8a6869e99ae2d4c0e6c185b605d8f723755e9885174b277eb8a18a386cf4298"

RPROVIDES:${PN} += "gcr3-ssh-askpass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
