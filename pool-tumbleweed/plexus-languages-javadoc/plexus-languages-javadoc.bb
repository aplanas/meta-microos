SUMMARY = "API documentation for plexus-languages"
DESCRIPTION = "API documentation for plexus-languages."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "plexus-languages-javadoc-1.1.1-2.7.noarch.rpm"
RPM_HASH = "334ac18949b64f3ffe038ff874e6dd6c4a921bdef39f2590d6605d0d37886264948980eda1a54a9ee3fb9ad262efb7f7158b4ccb001cf4300ec75e3e4fb02fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-languages-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
