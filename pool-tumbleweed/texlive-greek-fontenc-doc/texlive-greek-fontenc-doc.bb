SUMMARY = "Documentation for texlive-greek-fontenc"
DESCRIPTION = "This package includes the documentation for texlive-greek-fontenc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn66513"

RPM_NAME = "texlive-greek-fontenc-doc-2023.209.2.2.1svn66513-54.2.noarch.rpm"
RPM_HASH = "20ec5a63095d4df21a21441dff373426fef1c18d93e2e83cc4dff9dcd1dc0cd4c24b57587c18951b9bbe3ebb4bb6ed72e6410f23fe4d84ec4088f121afe80cc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greek-fontenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
