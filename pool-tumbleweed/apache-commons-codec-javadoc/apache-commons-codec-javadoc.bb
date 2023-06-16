SUMMARY = "Javadoc for apache-commons-codec"
DESCRIPTION = "Javadoc for apache-commons-codec."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "apache-commons-codec-javadoc-1.15-2.4.noarch.rpm"
RPM_HASH = "69dc74b37c94fd6a00475d92b983e0578e4bd0df0e080085eecf2cb62f54d6f9239bdf7a2a8e49200de512ca57be89a4347f13be4331396f21ac793b93f78b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-codec-javadoc \
commons-codec-javadoc \
jakarta-commons-codec-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
javapackages-filesystem"

inherit rpm
