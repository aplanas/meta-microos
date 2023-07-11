SUMMARY = "Javadoc for time-api"
DESCRIPTION = "This package contains javadoc for time-api."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & SUSE-Public-Domain"

PV = "0.6.4"

RPM_NAME = "time-api-javadoc-0.6.4-3.20.noarch.rpm"
RPM_HASH = "865521262bb1fdc2229a8e11491d2dd5796e7309c94810a6948de53b15376ec2f41b1e604e6e77fb981f79309c4d5733b637d900feea451f31535ba5aed1bcb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "time-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
