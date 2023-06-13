SUMMARY = "XPATH support for saxon8"
DESCRIPTION = "Provides support for the JAXP 1.3 XPath API. Requires the JAXP 1.3 \
version of jaxp-api.jar on the classpath, if not running under JDK 1.5."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-xpath-B.8.8-133.6.noarch.rpm"
RPM_HASH = "ac3c3d99f692f1254b53178ca1ba0aaac17218cfb54fe74a92ae7841a13db32f9adc7747278d9ec4a9828ec74a9984362503282b60e41acbea9471243dd1407a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-xpath"

RDEPENDS:${PN} += "saxon8"

inherit rpm
