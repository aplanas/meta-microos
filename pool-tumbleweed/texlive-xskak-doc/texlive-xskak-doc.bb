SUMMARY = "Documentation for texlive-xskak"
DESCRIPTION = "This package includes the documentation for texlive-xskak"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn51432"

RPM_NAME = "texlive-xskak-doc-2023.209.1.5svn51432-53.2.noarch.rpm"
RPM_HASH = "6f76b3e9cda81a590bfe20beb6d68da19d7f2910ab17e2c63ce6f098bb46cd3c3716aa0c8f99f587263ca8eba83fdb865964e7cc56ef35750486b88420e308ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xskak-doc"

RDEPENDS:${PN} += ""

inherit rpm
