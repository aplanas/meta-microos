SUMMARY = "Polish documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Polish documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-pl-7.0.6-1.1.noarch.rpm"
RPM_HASH = "d5aeff270a23f51db191a47681ce60685ec97dcb34deca20a21f2e716dad3d7e09a94ed0fa7df4329e9bc3343fbb9184646cb595cdc4622aa6f246cc37a894ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-pl \
locale-kicad-doc-pl"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
