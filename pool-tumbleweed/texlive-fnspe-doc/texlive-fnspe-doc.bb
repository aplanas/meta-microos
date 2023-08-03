SUMMARY = "Documentation for texlive-fnspe"
DESCRIPTION = "This package includes the documentation for texlive-fnspe"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn45360"

RPM_NAME = "texlive-fnspe-doc-2023.209.1.2asvn45360-53.1.noarch.rpm"
RPM_HASH = "46eabb1c1231d85314a710044874946f3aa7d77cf5acda454235bc86d7212aecc89f5dd42ca33f54362b0fefcb7c802daa67292e2d1b0a389fc61bc6abc0bc8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnspe-doc"

RDEPENDS:${PN} += ""

inherit rpm
