SUMMARY = "Javadoc for oro"
DESCRIPTION = "Javadoc for oro."
LICENSE = "Apache-2.0"

PV = "2.0.8"

RPM_NAME = "oro-javadoc-2.0.8-297.7.noarch.rpm"
RPM_HASH = "e8cc5d4d0253ac90024587a9489cf393219a3d3acac6e638e05be89865929e35a8fbe4f08a2bcfead803590ca5faa477b875e0700961a2f314cfd129f45d0d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oro-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
