SUMMARY = "Vim syntax highlighting for icinga2"
DESCRIPTION = "Provides Vim syntax highlighting for icinga2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "vim-icinga2-2.13.8-2.1.aarch64.rpm"
RPM_HASH = "7e66ff18043e10ee278c3d15446bddf83c4e9792e941444c20d876eec8b69a4f821d781ae0fc85a7f56aea30e2a8d496786df110b12ad56a256d618849e2c3aa"

RPROVIDES:${PN} += "vim-icinga2"

RDEPENDS:${PN} += "vim"

inherit rpm
