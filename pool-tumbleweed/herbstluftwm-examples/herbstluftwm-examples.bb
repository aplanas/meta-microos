SUMMARY = "Example scripts for herbstluftwm"
DESCRIPTION = "Sample bash scripts for herbstluftwm and herbstclient, which give the user \
an idea of what is possible."
LICENSE = "BSD-2-Clause"

PV = "0.9.5"

RPM_NAME = "herbstluftwm-examples-0.9.5-1.5.noarch.rpm"
RPM_HASH = "61983a78977c20824c7ca2a37de8379769ab4148c457560aaf7a42a0c254afd828d0b58877b7bdc9f37e6455ac7d99ef60b9a7803eb897ebf4155a5edf1cdbd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-examples"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
herbstluftwm"

inherit rpm
