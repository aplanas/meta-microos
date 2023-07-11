SUMMARY = "OpenTracing support for Django applications"
DESCRIPTION = "OpenTracing support for Django applications."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-django-opentracing-1.1.0-2.6.noarch.rpm"
RPM_HASH = "b34881be1eff075dddeca5e494ad6735172b07e288a14a5714cbf259f817cfd58e2570ef6ba1174310996054894af271e3f0241413862a593a4680d568774d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-opentracing \
python310-django-opentracing \
python3dist-django-opentracing"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-opentracing \
python310-six"

inherit rpm
