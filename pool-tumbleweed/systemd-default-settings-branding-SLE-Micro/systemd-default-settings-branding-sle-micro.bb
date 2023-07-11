SUMMARY = "Specific customization of systemd defaults settings for SLE-Micro"
DESCRIPTION = "This package overrides some of the upstream default settings to make \
them better suited for SLE-Micro distributions."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "systemd-default-settings-branding-SLE-Micro-0.7-2.7.noarch.rpm"
RPM_HASH = "670851194ce25ebe6973298c700cd5281705e46caeadb98fb49f0fa877d411c9318556eaf3c256c771c9c60ff6a325869514dc3ae79fcdc0e9c797eb1021ca0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding \
systemd-default-settings-branding-SLE-Micro"

RDEPENDS:${PN} += "systemd-default-settings"

inherit rpm
