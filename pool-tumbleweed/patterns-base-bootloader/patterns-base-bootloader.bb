SUMMARY = "Bootloader"
DESCRIPTION = "This pattern holds files required for booting the system"
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-bootloader-20200505-42.1.aarch64.rpm"
RPM_HASH = "5658397e79276d386b7d0dc19e7133e176a79d5297a59f642b1b751c7f82603fb4847130df4d332b63ecc6bf5441794e62416873f68892575874b43e0511fcc1"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
patterns-base-bootloader"

RDEPENDS:${PN} += "grub2 \
grub2-arm64-efi \
mokutil \
shim"

inherit rpm
