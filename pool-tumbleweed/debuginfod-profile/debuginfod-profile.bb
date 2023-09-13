SUMMARY = "Profile files for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The debuginfod-profile package contains a profile files that set default \
URL for a distribution."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-profile-0.189-5.1.aarch64.rpm"
RPM_HASH = "f314d2c7ff1e8ea574ff9ef2da78085ce2b6415a169a3de67b5964e6b328f799dce4cec0450d99e8913f62228bee38fa461d7e9ccff4dffffc12724301b0c73c"

RPROVIDES:${PN} += "config-debuginfod-profile \
debuginfod-profile"

RDEPENDS:${PN} += ""

inherit rpm
