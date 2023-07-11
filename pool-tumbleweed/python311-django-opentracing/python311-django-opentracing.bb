SUMMARY = "OpenTracing support for Django applications"
DESCRIPTION = "OpenTracing support for Django applications."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-django-opentracing-1.1.0-2.6.noarch.rpm"
RPM_HASH = "9526170b207d21100292b91bfbb83767d42b7fd025dac646ec02a0fdc3b2c26c684400f82570e5fadb8e2d44470259814ffe5ada5380b46796344881e8995303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-opentracing \
python3.11dist-django-opentracing \
python311-django-opentracing \
python3dist-django-opentracing"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-opentracing \
python311-six"

inherit rpm
