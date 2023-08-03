SUMMARY = "Documentation for texlive-tasks"
DESCRIPTION = "This package includes the documentation for texlive-tasks"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4asvn61541"

RPM_NAME = "texlive-tasks-doc-2023.209.1.4asvn61541-55.1.noarch.rpm"
RPM_HASH = "83fc55c1d73ab061bd7910b7d7fdf0f0ce9385dd6e6302f8660fd7f47e85aceddc72809d232faf5f74456c524061efb7bc117fa226d3efbb42ed2a91663e8844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tasks-doc"

RDEPENDS:${PN} += ""

inherit rpm
