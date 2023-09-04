SUMMARY = "Linux Kernel Development"
DESCRIPTION = "Tools for Linux kernel development."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_kernel-20170319-12.1.aarch64.rpm"
RPM_HASH = "fc86940be94f4f8abffae648303c468f6bbf6ecf7c3a5ffa066e43b1dd2c63807423574b078e2d1fa135b55066dabd9eaa07ed06034c2052b75c4022700c5d20"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-base-devel-kernel"

RDEPENDS:${PN} += "pattern-"

inherit rpm
