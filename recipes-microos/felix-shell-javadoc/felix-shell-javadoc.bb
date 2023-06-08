SUMMARY = "API documentation for felix-shell"
DESCRIPTION = "This package contains API documentation for felix-shell."
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "felix-shell-javadoc-1.4.3-4.6.noarch.rpm"
RPM_HASH = "ed61e49967ac5a4fe37961670c2905fcc7756de16c64b0fe2baea7dbd0b187536bb2f7e35e82efbfe082231bbe706a0828617a304df9fd48ca952456ec634948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-shell-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
