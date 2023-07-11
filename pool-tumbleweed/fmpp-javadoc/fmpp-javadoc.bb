SUMMARY = "Javadoc for fmpp"
DESCRIPTION = "Javadoc for fmpp."
LICENSE = "Apache-2.0"

PV = "0.9.16"

RPM_NAME = "fmpp-javadoc-0.9.16-2.11.noarch.rpm"
RPM_HASH = "b0580cfa7871616ccc94a5b14b3c475a9aeb90b57dcf4e6fdb3fe85f7eac2633ee629bd5e87dcfb7c033815c87c8a1e91725177f1538e782e045ee13ef3c317c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fmpp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
