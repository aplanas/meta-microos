SUMMARY = "OpenTracing support for Django applications"
DESCRIPTION = "OpenTracing support for Django applications."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-django-opentracing-1.1.0-2.4.noarch.rpm"
RPM_HASH = "d43b21e1a2597cad9439e79a9c48b3d1089d36f9bb8d4d5dcb4b55b7a0623ed591ae2ecb74324cde24d81b004965a548ba7bf8ec72ac68cd68286493c65defe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-opentracing \
python311-django-opentracing \
python3dist-django-opentracing"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-opentracing \
python311-six"

inherit rpm
