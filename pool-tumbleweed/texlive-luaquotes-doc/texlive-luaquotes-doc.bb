SUMMARY = "Documentation for texlive-luaquotes"
DESCRIPTION = "This package includes the documentation for texlive-luaquotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn65652"

RPM_NAME = "texlive-luaquotes-doc-2023.201.1.4.0svn65652-52.1.noarch.rpm"
RPM_HASH = "505b545cfe838247900a7143f06c2bfd2c10ee27eac15eaa047baef516e199274a05848e6b773c259e06a4ced91db5c06898d52ff101b147655a9dbdd5d873f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaquotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
