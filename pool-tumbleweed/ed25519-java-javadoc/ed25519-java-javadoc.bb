SUMMARY = "Javadoc for ed25519-java"
DESCRIPTION = "This package contains javadoc for ed25519-java."
LICENSE = "CC0-1.0"

PV = "0.3.0"

RPM_NAME = "ed25519-java-javadoc-0.3.0-2.10.noarch.rpm"
RPM_HASH = "80c27f78706419dd81971634ff9bb1893dc03f845b1c709651e5f34206393e6d1c89da0d21db72a47c7858c6c4e8878a7272cc6a344a5b30832f551c7f92bb67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ed25519-java-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
