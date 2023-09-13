SUMMARY = "A multi-host manager for dotfiles"
DESCRIPTION = "chezmoi is a manager for personal preference configs and state files \
('dotfiles') that programs such as editors might create. chezmoi \
sources dotfiles from a GitHub repository and installs them onto new, \
empty machines."
LICENSE = "MIT"

PV = "2.39.1"

RPM_NAME = "chezmoi-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "8db40cb2457a6ed49743e691119f043cf51eac36ab1f1776069de18d90c8d3d0b3c854e71f153ea0bef0cd1542d21703fea05908630078663aafd4500df6a765"

RPROVIDES:${PN} += "chezmoi"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
