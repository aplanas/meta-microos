SUMMARY = "Chinese documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Chinese documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-zh-7.0.6-1.1.noarch.rpm"
RPM_HASH = "fb66310a000e5b5a957463a2568f33958aaa6bbccfc6606e11840004d525b0d0cd19a0f193660061ad89c9c94d93cc6a26434e6abf69d044fc93ee7d6836a120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-zh \
locale-kicad-doc-zh"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
