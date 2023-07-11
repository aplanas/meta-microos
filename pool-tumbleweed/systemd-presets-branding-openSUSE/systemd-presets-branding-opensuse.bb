SUMMARY = "Systemd default presets for openSUSE"
DESCRIPTION = "Default presets for systemd on openSUSE distribution. \
 \
These are the openSUSE specific presets. The default \
presets needed for all SUSE based distributions can be \
found in systemd-presets-common-SUSE."
LICENSE = "GPL-2.0-or-later"

PV = "12.2"

RPM_NAME = "systemd-presets-branding-openSUSE-12.2-22.1.noarch.rpm"
RPM_HASH = "436f729b00a045e08691430f882b789bb0f143b5487ee80a8165ec1be51868f1ab5869eddedcc65b627a3028aa3708eb48d385c7c38bd011bc81ed4f79099f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding \
systemd-presets-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
coreutils \
systemd-presets-common-SUSE"

inherit rpm
