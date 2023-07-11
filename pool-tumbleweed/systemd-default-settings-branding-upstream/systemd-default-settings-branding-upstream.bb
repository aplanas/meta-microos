SUMMARY = "Restore upstream systemd defaults settings"
DESCRIPTION = "Installing this package restores some of the upstream default settings \
by uninstalling all drop-ins shipped by systemd-default-settings and its branding sub \
package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "systemd-default-settings-branding-upstream-0.7-2.7.noarch.rpm"
RPM_HASH = "de76b35066d658c019703ad58fc737a84b4e38a80314ec0b8efd8a6b580ecaa0afdf821a169cd20a39394491a7afce903f467d5685bd9c15c232a21d3d48e8c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding \
systemd-default-settings-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
