SUMMARY = "Zsh tab-completion for flatpak"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information. \
 \
This package provides zsh tab-completion for flatpak."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "flatpak-zsh-completion-1.14.4-1.2.noarch.rpm"
RPM_HASH = "1bee51342ae928632cc3b2abda197b3dd808a6e6e62a316f112e33225511df4cd63dc2d71eb3bb3981c5f73fd976a7702e32caba4bfaf7e2d7c322ddbea24d0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flatpak-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
