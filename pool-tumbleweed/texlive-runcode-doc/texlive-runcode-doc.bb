SUMMARY = "Documentation for texlive-runcode"
DESCRIPTION = "This package includes the documentation for texlive-runcode"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn65588"

RPM_NAME = "texlive-runcode-doc-2023.209.1.8svn65588-54.1.noarch.rpm"
RPM_HASH = "6549c4bf9b164f3e2f15777ffa110c0117de9cda75e9fc7dcd1b87b7f99aacb7ad23737578e01536e30f67ab6dd0a23122d8d22d5f36089863d876d7edc2e8d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-runcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
