SUMMARY = "Restore upstream systemd defaults settings"
DESCRIPTION = "Installing this package restores some of the upstream default settings \
by uninstalling all drop-ins shipped by systemd-default-settings and its branding sub \
package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "systemd-default-settings-branding-upstream-0.7-2.6.noarch.rpm"
RPM_HASH = "626c82bd4d9678e83e545263c04ab6228e01080d4f089bb95881f3b8d25a679842791128dd693462d9167bb6bb31762177caed49e9727fa6a8fb9d8049cbc289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding \
systemd-default-settings-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
