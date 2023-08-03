SUMMARY = "Documentation for texlive-lexikon"
DESCRIPTION = "This package includes the documentation for texlive-lexikon"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn17364"

RPM_NAME = "texlive-lexikon-doc-2023.209.1.0csvn17364-55.1.noarch.rpm"
RPM_HASH = "bb8341baf895210b08baac32b230bf5a45dff6f671dd6b404df6b9562d65f7703efd979dc635ade45b47471456b75fdd5a1e634bbc4af2f8adcf49648bab9c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lexikon-doc"

RDEPENDS:${PN} += ""

inherit rpm
