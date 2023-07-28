SUMMARY = "File triggers for sdbootutil"
DESCRIPTION = "File trigger scripts for sdbootutil"
LICENSE = "MIT"

PV = "1+git20230717.dac075e"

RPM_NAME = "sdbootutil-filetriggers-1+git20230717.dac075e-1.1.aarch64.rpm"
RPM_HASH = "f6846fc9e1b1bc67aad23dbbae3f8cf4a7b4af768c78409c009852fd59ed1f9a0929e3dda493ce1557cf8c21a44225ae7a96350bf59664faf014a7887f6af8fa"

RPROVIDES:${PN} += "sdbootutil-filetriggers"

RDEPENDS:${PN} += "sdbootutil"

inherit rpm
