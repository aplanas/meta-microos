SUMMARY = "API documentation for assertj-core"
DESCRIPTION = "This package provides API documentation for assertj-core."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "assertj-core-javadoc-3.8.0-1.22.noarch.rpm"
RPM_HASH = "ade37f1d697c9a8cc0ded9d8a9724243a885d552ebb8b6d79e3dde53574b499d421cffaa0c5cfacea902435b1c427cb70fef7f76bd4c8b68071572c2080da741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "assertj-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
