SUMMARY = "Documentation for junit5"
DESCRIPTION = "JUnit 5 User Guide."
LICENSE = "EPL-2.0"

PV = "5.8.2"

RPM_NAME = "junit5-guide-5.8.2-1.10.noarch.rpm"
RPM_HASH = "5619bc9842c80424f972b05e73c9c5d774d38033e2e3add4026b8c36dfef6397cd7d517bd942206bb9b50d7479d3884f09fc92f26f3d60677052945515a36ae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5-guide"

RDEPENDS:${PN} += "junit5-javadoc"

inherit rpm
