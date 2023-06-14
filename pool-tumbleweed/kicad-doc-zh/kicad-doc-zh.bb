SUMMARY = "Chinese documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Chinese documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-zh-7.0.5-1.1.noarch.rpm"
RPM_HASH = "a334aac6a0cc039fe4cee3e12e224c8d42d09989f707c61de3d05fc96def5dd00f2ec346553cb2c3e5dd38f060546123389e8637e9822adb598af5cc16cc76db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-zh \
locale-kicad-doc-zh"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
