SUMMARY = "Documentation for texlive-epiolmec"
DESCRIPTION = "This package includes the documentation for texlive-epiolmec"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-epiolmec-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "9e088c54bb6bc4044ca147ae7eae078d6e74a9d213e78fc642e3e0e12a64df5d0a690b6ec19be64d99ab2d02aa8957bb67dbed6ca8e71a65ee38002701a3657b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epiolmec-doc"

RDEPENDS:${PN} += ""

inherit rpm
