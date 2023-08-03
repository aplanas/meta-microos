SUMMARY = "Documentation for texlive-biblatex-phys"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-phys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn55643"

RPM_NAME = "texlive-biblatex-phys-doc-2023.209.1.1bsvn55643-54.1.noarch.rpm"
RPM_HASH = "73d2e7db0f45c6590f079a659030eb3b83f8db2e1f29407c0518ec26a7fa0e88cd3ac7080524be826d60edebe18ef43cda3e642b9c02ee22263814b538ed6e6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-phys-doc"

RDEPENDS:${PN} += ""

inherit rpm
