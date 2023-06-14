SUMMARY = "Profile files for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The debuginfod-profile package contains a profile files that set default \
URL for a distribution."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-profile-0.189-3.1.aarch64.rpm"
RPM_HASH = "24ecfce6e2d5334eb88a20b613d153a0b1fe027153577c001c2c2bb8b9f25dc66b3a4186723960cfbfb53d4af0e6b9b133f243f234d2264e0ce350c020e7c567"

RPROVIDES:${PN} += "config-debuginfod-profile \
debuginfod-profile"

RDEPENDS:${PN} += ""

inherit rpm
