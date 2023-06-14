SUMMARY = "Russian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Russian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-ru-7.0.5-1.1.noarch.rpm"
RPM_HASH = "c50759e51f2e0bb2ed7fbec14a1845d69c8b7293924bddbeb5183fe1b5776aba131f42e81bb082282f4e24b816933f0c8097466cae1ef55aeaa7f5b55df2e9ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ru \
locale-kicad-doc-ru"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
