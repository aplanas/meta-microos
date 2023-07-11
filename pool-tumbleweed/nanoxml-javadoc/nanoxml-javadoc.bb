SUMMARY = "Javadoc for nanoxml"
DESCRIPTION = "Java documentation for nanoxml."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-javadoc-2.2.3-4.7.noarch.rpm"
RPM_HASH = "bf010482dad4058852befc6823d44d5c1ca79d0a8c78ce3f9746356de8e82e402c572bdc90910a68aad19348b8c3a5e129017964bebaaa36e0b22014d7d2c430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
