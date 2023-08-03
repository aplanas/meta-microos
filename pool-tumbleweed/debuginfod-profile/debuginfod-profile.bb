SUMMARY = "Profile files for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The debuginfod-profile package contains a profile files that set default \
URL for a distribution."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-profile-0.189-4.1.aarch64.rpm"
RPM_HASH = "e753a6401df44722fd1362bae9edecd8f17fc437824c2b08a6ea9baa13f1b114b0c9f14952ab2d97b8bb92aa5d41f11c9113e89b847982e863cec5bafde4a788"

RPROVIDES:${PN} += "config-debuginfod-profile \
debuginfod-profile"

RDEPENDS:${PN} += ""

inherit rpm
