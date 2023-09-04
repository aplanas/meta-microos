SUMMARY = "Catalan documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Catalan documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-ca-7.0.6-1.1.noarch.rpm"
RPM_HASH = "3e8dc06809b53520ed2eea28398595aaf55b32cadef4dafea466b5782556b1052b3621727aaa0fe191c459bf3ea7f2c90e2b20ec027ef7c0313e64e7dce89ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ca \
locale-kicad-doc-ca"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
