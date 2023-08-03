SUMMARY = "Documentation for texlive-datetime2-bahasai"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-bahasai"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn46287"

RPM_NAME = "texlive-datetime2-bahasai-doc-2023.209.1.01svn46287-55.1.noarch.rpm"
RPM_HASH = "f4fc17bb1af02d7882fe962ede05a85492bbc5dc487b2cb62a56af7e30df71f666dc92a396702dcebe180776545d4ddc779d0cf56c34164de753ca5ea93b237f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-bahasai-doc"

RDEPENDS:${PN} += ""

inherit rpm
