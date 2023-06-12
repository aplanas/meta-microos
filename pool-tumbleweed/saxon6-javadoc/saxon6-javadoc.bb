SUMMARY = "Javadoc for saxon6"
DESCRIPTION = "Javadoc for saxon6."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-javadoc-6.5.5-16.6.noarch.rpm"
RPM_HASH = "1173338ae7211e1e16bd2adf07480d7a2c4ec8a1632e8192bc27e14c6d48b044361cdc8bc9cf39b9170a903a166b47a26f718bf5a2d336d8536ab5fbdd2e3f09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon6-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
