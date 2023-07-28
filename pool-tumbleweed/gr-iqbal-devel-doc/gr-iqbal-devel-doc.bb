SUMMARY = "Documentation for gr-iqbal"
DESCRIPTION = "Documentation for gr-iqbal module for GNU Radio."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "gr-iqbal-devel-doc-0.39.0git20210108-1.14.noarch.rpm"
RPM_HASH = "cd6b58181036261dfa7d50de8c7d95e49d5cbc9fafe4f6b797fd22581200119bac8fdcb079f930a54203f08fa86b84fb23aebfc34d25a3ae8c3f11789c6b926d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-iqbal-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
