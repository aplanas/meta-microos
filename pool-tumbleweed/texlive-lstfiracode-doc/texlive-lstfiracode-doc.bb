SUMMARY = "Documentation for texlive-lstfiracode"
DESCRIPTION = "This package includes the documentation for texlive-lstfiracode"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1csvn49503"

RPM_NAME = "texlive-lstfiracode-doc-2023.201.0.0.1csvn49503-52.1.noarch.rpm"
RPM_HASH = "f744a9a9b8409debac515a8fe87577aa2dec3ef3fb873c1e6c4ab210087a8fa9c6812a77b12cb23abe3005cdaceaa1cfe5c2fd5883deb92915536a44440ec55e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lstfiracode-doc"

RDEPENDS:${PN} += ""

inherit rpm
