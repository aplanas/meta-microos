SUMMARY = "An Ecclesiastic Scripts Font"
DESCRIPTION = "Analecta is an ecclesiastic scripts font, covering Basic Latin, Greek and Coptic, some Punctuation and other Symbols, Coptic, typographica varia, Specials, Gothic and Deseret."
LICENSE = "SUSE-Permissive"

PV = "5.17"

RPM_NAME = "gdouros-analecta-fonts-5.17-1.15.noarch.rpm"
RPM_HASH = "00d1815e6199ad99bfc12e35189cae376cba6d8631396627c22362667c64703a82a35f1217f69e0bdcf372bbd9ae9182636f4d297ff4a587b72d3caa1fc859a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "analecta-fonts gdouros-analecta-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
