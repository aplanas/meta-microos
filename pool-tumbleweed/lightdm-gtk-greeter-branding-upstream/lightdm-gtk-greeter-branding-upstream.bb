SUMMARY = "Upstream branding of lightdm-gtk-greeter"
DESCRIPTION = "This package provides the upstream look and feel for lightdm-gtk-greeter."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.8"

RPM_NAME = "lightdm-gtk-greeter-branding-upstream-2.0.8-1.13.noarch.rpm"
RPM_HASH = "ae2e75352cd412c17a7c757290c00eeb7a38acfceeaba6d52d938ab6878e4157f85c561938a1498477834d5449a0e0cf7b7c8de571728bfd3385a69d04c8c8a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lightdm-gtk-greeter-branding-upstream \
lightdm-gtk-greeter-branding \
lightdm-gtk-greeter-branding-upstream"

RDEPENDS:${PN} += "lightdm-gtk-greeter"

inherit rpm
