SUMMARY = "A multi-host manager for dotfiles"
DESCRIPTION = "chezmoi is a manager for personal preference configs and state files \
('dotfiles') that programs such as editors might create. chezmoi \
sources dotfiles from a GitHub repository and installs them onto new, \
empty machines."
LICENSE = "MIT"

PV = "2.33.6"

RPM_NAME = "chezmoi-2.33.6-1.1.aarch64.rpm"
RPM_HASH = "d5a35176870f65c0ace70854655dfcc4f0ee46a03cc6ffcaa4a98d4ac557b62ed4b2f0f651314121cb67ae4d4e92a1aadeeea6d62b01affa5d80f96c4c5c5efd"

RPROVIDES:${PN} += "chezmoi"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
