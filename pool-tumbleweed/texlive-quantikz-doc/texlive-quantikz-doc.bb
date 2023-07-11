SUMMARY = "Documentation for texlive-quantikz"
DESCRIPTION = "This package includes the documentation for texlive-quantikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.6svn54911"

RPM_NAME = "texlive-quantikz-doc-2023.201.0.0.9.6svn54911-53.2.noarch.rpm"
RPM_HASH = "79072d2ee02cd6424dbe2cf5c42e2050af983cfbe29aee5aeeff3788b7214c69baa8e455a4a8da545f7736221651f89f5ff69360ea58a6fb36b20379f5013d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
