SUMMARY = "Zsh tab-completion for flatpak"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information. \
 \
This package provides zsh tab-completion for flatpak."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "flatpak-zsh-completion-1.14.4-1.3.noarch.rpm"
RPM_HASH = "ce13eb306cbea61fb065c3def0c18549bdc03a1813e6d994dac7f86f5a58557573749605345a552062efcde7bde3f752c4e7e4982cfd0f06b3658739493ed525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flatpak-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
