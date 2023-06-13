SUMMARY = "Javadoc for time-api"
DESCRIPTION = "This package contains javadoc for time-api."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & SUSE-Public-Domain"

PV = "0.6.4"

RPM_NAME = "time-api-javadoc-0.6.4-3.19.noarch.rpm"
RPM_HASH = "5dae71932e2e1db4d5ab00f4a986ad6c747e5ee1f985c2af47eecc2615b6e36c17fa7ea4adac6698697ad7c061acd5af0bc9816f997cb673aac74482edbd8b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "time-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
