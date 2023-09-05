SUMMARY = "Upstream branding for GRUB2's graphical console"
DESCRIPTION = "Upstream branding for GRUB2's graphical console"
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-branding-upstream-2.12~rc1-1.1.aarch64.rpm"
RPM_HASH = "2e6416fc3034c677e09394d78a7fe250dbb43e65aa3533bb9c0f2430f5670b18df125a8bbfdf78bc5916d572e54781e32287f0c91758458c78b33c8a74c4bfdb"

RPROVIDES:${PN} += "grub2-branding-upstream"

RDEPENDS:${PN} += "grub2"

inherit rpm
