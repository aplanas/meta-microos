SUMMARY = "API Documentation for template-resolver"
DESCRIPTION = "JavaDoc documentation for template-resolver"
LICENSE = "Apache-2.0"

PV = "0.1"

RPM_NAME = "template-resolver-javadoc-0.1-2.7.noarch.rpm"
RPM_HASH = "82f67265753f1a99a78300fcf2094bee7e916eed463ba28de5f09b521c5defbd7b2f109cf79a2cf6313909788311fa6c54e705fbabd2197312890d8b46cd4424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "template-resolver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
