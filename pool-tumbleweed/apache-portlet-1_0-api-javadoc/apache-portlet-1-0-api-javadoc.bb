SUMMARY = "Portlet API 1.0 from Jetspeed2"
DESCRIPTION = "Java Standard Portlet API accoring to JSR-168, from Jetspeed-2 . \
 \
Portlet API 1.0 from Jetspeed2."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "apache-portlet-1_0-api-javadoc-1.0-113.19.noarch.rpm"
RPM_HASH = "8be8c8a9f7edcd38493a417be673aca0efd10e6026ccde3a067d7d512f32d6bafb135b62d3e4af7658260172bd9aad552ad583328c18b6be5565408144786658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-portlet-1-0-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
