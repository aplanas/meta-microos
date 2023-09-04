SUMMARY = "A very basic desktop (previously part of x11 pattern)"
DESCRIPTION = "This pattern installs a rather basic desktop (icewm)"
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-basic_desktop-20200505-42.1.aarch64.rpm"
RPM_HASH = "20d25c6ca63da042e3ca26aef1e024b25b61b513615afdb800d20e198c485a67f3626882efacddeab68b02e17c4c2d7e89fad1839fa3ae5c6f19ed4aebbdb145"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-basic-desktop"

RDEPENDS:${PN} += "icewm-default \
icewm-theme-branding \
pattern-"

inherit rpm
