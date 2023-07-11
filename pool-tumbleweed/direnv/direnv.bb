SUMMARY = "Environment switcher for shells"
DESCRIPTION = "direnv knows how to hook into bash, zsh, tcsh and fish shell to load \
or unload environment variables depending on the current directory. \
This allows to have project-specific environment variables and not \
clutter the '~/.profile' file."
LICENSE = "MIT"

PV = "2.32.3"

RPM_NAME = "direnv-2.32.3-1.1.aarch64.rpm"
RPM_HASH = "d3e2c385716f503444bcedc6545b959284673db02f888348f2cc9eecfa7b08b882d5f0ba37e638b9f155bfa0c89895de907412eec4051c1e5d8b40f7d62fea86"

RPROVIDES:${PN} += "direnv"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
