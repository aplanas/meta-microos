SUMMARY = "Javadoc for felix-gogo-shell"
DESCRIPTION = "This package contains the API documentation for felix-gogo-shell."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "felix-gogo-shell-javadoc-1.1.4-1.3.noarch.rpm"
RPM_HASH = "4d8e6704a3e45d22f28491e61d33c0f8d2fc44a01c7203899277697cfce38d2fcb9c98f5b3d465d940cd1c36253885d17881f4b3632d7a60f29a0833fbe771a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-shell-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
