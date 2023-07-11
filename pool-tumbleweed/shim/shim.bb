SUMMARY = "UEFI shim loader"
DESCRIPTION = "shim is a trivial EFI application that, when run, attempts to open and \
execute another application."
LICENSE = "BSD-2-Clause"

PV = "15.7"

RPM_NAME = "shim-15.7-7.2.aarch64.rpm"
RPM_HASH = "f87ce233d3736e9cd5e09a18aea55856c7fdea4e6c8804c81f0f404347c11c662fdd3144890788003bd6990583c1fdcfe670e6d146992e56db9e50ca35885687"

RPROVIDES:${PN} += "shim"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
grub2-arm64-efi \
mokutil"

inherit rpm
