SUMMARY = "Library for EFI Applications"
DESCRIPTION = "Library to develop EFI applications for IA-64 (IPF), IA-32 (x86), x86_64, \
ARM-32, and ARM-64 platforms using the GNU toolchain and the EFI development \
environment."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "3.0.15"

RPM_NAME = "gnu-efi-3.0.15-1.4.aarch64.rpm"
RPM_HASH = "54f90dedccb98a7a0228dbe657cf0cd65dbb8b632a88284afcd1a3483ff1e52b0c70b9b92f12be9f44a1642df7acb8b03bb7beab72561c0989a165895884d89e"

RPROVIDES:${PN} += "gnu-efi"

RDEPENDS:${PN} += ""

inherit rpm
