SUMMARY = "Javadoc for codemodel"
DESCRIPTION = "This package contains the API documentation for codemodel."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.6"

RPM_NAME = "codemodel-javadoc-2.6-4.5.noarch.rpm"
RPM_HASH = "d045e7a21cede09a9da83898b493f3e3939fedfc612fc76c26098ded61516b5acab7e8279b8a2d228afad0107bf0389b9408f8c9c1f67661f87857a0ccf8e6cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codemodel-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
