SUMMARY = "Documentation for texlive-endiagram"
DESCRIPTION = "This package includes the documentation for texlive-endiagram"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1dsvn34486"

RPM_NAME = "texlive-endiagram-doc-2023.209.0.0.1dsvn34486-54.1.noarch.rpm"
RPM_HASH = "ac763fde6a3727333b94ede1a143e0b1f553de1b86f9d7f12665a63b47d5cd4d7b4afba3c428971836f344cd82c0006bbee455abba9f28504068652ed601280f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
