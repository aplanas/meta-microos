SUMMARY = "Profile files for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The debuginfod-profile package contains a profile files that set default \
URL for a distribution."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-profile-0.189-3.2.aarch64.rpm"
RPM_HASH = "6a941b61cb637462eff239912d493c69fb6e24d452ba5ad2c18d315f40703fb718f389290ce612adf8e8db04b83f48c6eba47b4b2c0e272efb02851a475d89d2"

RPROVIDES:${PN} += "config-debuginfod-profile \
debuginfod-profile"

RDEPENDS:${PN} += ""

inherit rpm
