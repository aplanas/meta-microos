SUMMARY = "Documentation for texlive-screenplay-pkg"
DESCRIPTION = "This package includes the documentation for texlive-screenplay-pkg"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44965"

RPM_NAME = "texlive-screenplay-pkg-doc-2023.209.1.1svn44965-54.1.noarch.rpm"
RPM_HASH = "92f0c9ede0f9c517f1e267e45440a740cad39b4b4a3f8cd11e033e6e3e3f41300c584e6a53d79d78624335980eb54762472adc453d220a5b622e74a91a774567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-screenplay-pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
