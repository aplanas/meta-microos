SUMMARY = "Profile files for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The debuginfod-profile package contains a profile files that set default \
URL for a distribution."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-profile-0.189-2.3.aarch64.rpm"
RPM_HASH = "a69b6aac381aa6656dc5ee5d05cfc6d2e2335b5909c69d24de7d477dc0fe65f69b82b77e2aec1fdf13b87917bea7955d736b5714bf3e9e51f87fb9592d8185d5"

RPROVIDES:${PN} += "config(debuginfod-profile) debuginfod-profile debuginfod-profile(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
