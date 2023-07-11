SUMMARY = "Javadoc for signpost-core"
DESCRIPTION = "This package contains the API documentation for signpost-core."
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "signpost-core-javadoc-1.2.1.2-3.11.noarch.rpm"
RPM_HASH = "7fe2bb984d3cc6d07852471e9281d2d7514669488c0b9f6de17a69898d1b152a8f026fafd197b4afc8e4cfa0a2e6eeef690ccc1bd29366eb4cbdaafe56b4e9ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "signpost-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
