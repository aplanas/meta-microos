SUMMARY = "Javadoc for language-detector"
DESCRIPTION = "This package contains javadoc for language-detector."
LICENSE = "Apache-2.0"

PV = "0.6"

RPM_NAME = "language-detector-javadoc-0.6-2.14.noarch.rpm"
RPM_HASH = "18878f28d1ea86ccdbed0166a057ad081f3226dcf264954892905a3fcce90a88ba512cae581466da482697e3895b5d6b24ea72319c179b2e66f9952bc5c9a878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "language-detector-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
