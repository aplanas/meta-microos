SUMMARY = "Javadoc for xmlunit"
DESCRIPTION = "Javadoc for xmlunit. Also contains userguide."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "xmlunit-javadoc-1.6-2.7.noarch.rpm"
RPM_HASH = "0e3ec6f5d2a784b6b366a51cb6b4515eb071760b8631ff7f39761c26b00701502da49d721e6dfd3688ff08202d0795442ccf5912d7818c0824a4f17ec3381765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlunit-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
