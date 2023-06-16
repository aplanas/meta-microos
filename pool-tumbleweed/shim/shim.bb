SUMMARY = "UEFI shim loader"
DESCRIPTION = "shim is a trivial EFI application that, when run, attempts to open and \
execute another application."
LICENSE = "BSD-2-Clause"

PV = "15.7"

RPM_NAME = "shim-15.7-7.1.aarch64.rpm"
RPM_HASH = "2da896dddb7191e0941fb5d0440f1ee71857a0a0b288b56d91ff664d0b42b04e31e7d969c2b23bd639a9c68306088e69ba6c7bb87fc03ce10074bfe44282f329"

RPROVIDES:${PN} += "shim"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
grub2-arm64-efi \
mokutil"

inherit rpm
