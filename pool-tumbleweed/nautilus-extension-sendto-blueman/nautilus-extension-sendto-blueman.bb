SUMMARY = "A sendto integration for Nautilus"
DESCRIPTION = "This package add sendto integration for Nautilus."
LICENSE = "GPL-3.0-only"

PV = "2.3.5"

RPM_NAME = "nautilus-extension-sendto-blueman-2.3.5-1.3.noarch.rpm"
RPM_HASH = "14f0a7ba99f004f3e5f6f24aa157d01784f76964a9f98ce38bb2ab7aec0d76f47b605c65deba595a93dc1a1dd8a8518a40926aee39a37b2eee5f2ff16f7696e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-sendto-blueman"

RDEPENDS:${PN} += "blueman \
typelib(GObject) \
typelib(Gio) \
typelib(Nautilus)"

inherit rpm
