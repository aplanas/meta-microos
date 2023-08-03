SUMMARY = "Documentation for texlive-tkz-euclide"
DESCRIPTION = "This package includes the documentation for texlive-tkz-euclide"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.02csvn65724"

RPM_NAME = "texlive-tkz-euclide-doc-2023.209.5.02csvn65724-53.1.noarch.rpm"
RPM_HASH = "b9bf2f0b34f6d94f3399d9f5dbbf79b3e9ac8955ee244d0443af6c2e3a0b3f8cf8cf6a66c1854b00e864fe322706f032b61b338bc571ab6eb5256de9dba09172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-euclide-doc"

RDEPENDS:${PN} += ""

inherit rpm
