SUMMARY = "Javadoc for nanoxml"
DESCRIPTION = "Java documentation for nanoxml."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-javadoc-2.2.3-4.6.noarch.rpm"
RPM_HASH = "9d25b4bc5cd9c9d0d5d8e60c129d2f1b8773d8f58c841efcde74e3e8d058291298d8db48f655c7fa0ea05fde4e7a5ca6a1e41fa22c00e39d073b2c4dc6e31e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
