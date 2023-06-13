SUMMARY = "Library for EFI Applications"
DESCRIPTION = "Library to develop EFI applications for IA-64 (IPF), IA-32 (x86), x86_64, \
ARM-32, and ARM-64 platforms using the GNU toolchain and the EFI development \
environment."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "3.0.15"

RPM_NAME = "gnu-efi-3.0.15-1.3.aarch64.rpm"
RPM_HASH = "bcce7be17f386e3a4341d6fe539afae169503a351096f51038d37f8ca1238791bdecd7bcf99b818698ac537527cebfe006a9fbcaa8fb14a83aeefcf0dfa260d4"

RPROVIDES:${PN} += "gnu-efi \
gnu-efi(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
