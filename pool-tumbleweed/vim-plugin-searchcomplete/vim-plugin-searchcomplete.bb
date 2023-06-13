SUMMARY = "Tab completion of words inside of a search"
DESCRIPTION = "This plugin allows to tab-complete words while typing in a \
search ('/')."
LICENSE = "GPL-2.0-only"

PV = "1.1"

RPM_NAME = "vim-plugin-searchcomplete-1.1-55.1.noarch.rpm"
RPM_HASH = "f09c0838caf4054f275607378f4dfd91a386535f65dfb0f2f5b613066a3e0bfbe8824e5ed7dfc52ac8f5cd35c66dced206580fd76b49465312f10c88aec0ef3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-searchcomplete"

RDEPENDS:${PN} += "vim"

inherit rpm
