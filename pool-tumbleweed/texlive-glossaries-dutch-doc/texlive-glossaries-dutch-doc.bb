SUMMARY = "Documentation for texlive-glossaries-dutch"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-dutch"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn35685"

RPM_NAME = "texlive-glossaries-dutch-doc-2023.201.1.1svn35685-53.2.noarch.rpm"
RPM_HASH = "31eabedb0397dfe6ec125d1de0304baef313d4be0a36edbf49aaff0304a994bfb4a54feacffc80b18a968a0b6b5c8c7e9f29aea4541029e86af4489716f37928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-dutch-doc"

RDEPENDS:${PN} += ""

inherit rpm
