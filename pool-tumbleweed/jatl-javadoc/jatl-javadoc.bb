SUMMARY = "Javadoc for jatl"
DESCRIPTION = "This package contains javadoc for jatl."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "jatl-javadoc-0.2.2-3.11.noarch.rpm"
RPM_HASH = "74a6a5755f2e371e6fadd8ea300ae7ac16559716c715258c7512d0f68591420629ec305c351ce9c134a87665b4a4273589f85bde8b191f6da5d5481748db46b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jatl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
