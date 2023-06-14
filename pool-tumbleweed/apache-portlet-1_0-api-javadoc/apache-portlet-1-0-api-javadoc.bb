SUMMARY = "Portlet API 1.0 from Jetspeed2"
DESCRIPTION = "Java Standard Portlet API accoring to JSR-168, from Jetspeed-2 . \
 \
Portlet API 1.0 from Jetspeed2."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "apache-portlet-1_0-api-javadoc-1.0-113.18.noarch.rpm"
RPM_HASH = "41eabcdf22664101a6bdd3e015d59f1c76bbcc5ea0fb1b7a719811ed48f810a0c6eea5ff9cc1797ed874ba268dfe8627b895e045bcb1f2fb13991e8b6b495743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-portlet-1-0-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
