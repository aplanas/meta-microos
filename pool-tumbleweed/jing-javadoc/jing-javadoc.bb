SUMMARY = "Javadoc API documentation for Jing"
DESCRIPTION = "Javadoc API documentation for Jing."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "jing-javadoc-20220510-3.1.noarch.rpm"
RPM_HASH = "99fdd5157209f63947edb145180471fe7ce5675f95111e6c26d0bbd6eaf9e3be6f1111fe19c64c605efeefe2bcd76ebc451c4b5a8ed1d4c501e397ec38078f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jing-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
