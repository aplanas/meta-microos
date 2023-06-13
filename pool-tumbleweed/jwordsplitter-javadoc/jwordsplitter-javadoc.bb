SUMMARY = "Javadoc for jwordsplitter"
DESCRIPTION = "This package contains javadoc for jwordsplitter."
LICENSE = "Apache-2.0"

PV = "4.4"

RPM_NAME = "jwordsplitter-javadoc-4.4-1.18.noarch.rpm"
RPM_HASH = "d69efc7935493e1e3c72b7fa56f6538c9fd70db39f37ef6d43755606f31c0136864473f2afc8c46105de0d434251f754a9bd76beee01d5ea07c3234f672f92b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwordsplitter-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
