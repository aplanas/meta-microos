SUMMARY = "Javadoc for jwordsplitter"
DESCRIPTION = "This package contains javadoc for jwordsplitter."
LICENSE = "Apache-2.0"

PV = "4.4"

RPM_NAME = "jwordsplitter-javadoc-4.4-1.19.noarch.rpm"
RPM_HASH = "1db7effe0ab42303544931680d2f8d8538b44f863ed024526addd973d5b942d92340876ee095294f13f72f3b8eb39677d56e0e767e91315d90aa2431c4a8b786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwordsplitter-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
