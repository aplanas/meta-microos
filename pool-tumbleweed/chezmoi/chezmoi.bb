SUMMARY = "A multi-host manager for dotfiles"
DESCRIPTION = "chezmoi is a manager for personal preference configs and state files \
('dotfiles') that programs such as editors might create. chezmoi \
sources dotfiles from a GitHub repository and installs them onto new, \
empty machines."
LICENSE = "MIT"

PV = "2.34.3"

RPM_NAME = "chezmoi-2.34.3-1.1.aarch64.rpm"
RPM_HASH = "0c5641677b98ed80df00fa10dbaa23a137dc0c4bf8425350c60a13264fe05b8f41d97e2463d1c72f1c14016f9ca155d0572ebe3765a286b4e4f154ce47069366"

RPROVIDES:${PN} += "chezmoi"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
