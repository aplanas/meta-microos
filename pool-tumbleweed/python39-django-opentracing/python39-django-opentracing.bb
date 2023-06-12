SUMMARY = "OpenTracing support for Django applications"
DESCRIPTION = "OpenTracing support for Django applications."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-django-opentracing-1.1.0-2.4.noarch.rpm"
RPM_HASH = "93f2bf09692230405f5a5f2512767a0a28cc79d621ffd4a9359b0646715d53eba7e65afe69ed310357109b091b89d8c68ca8c07b92149969aba96ea8f3daf1fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-opentracing) \
python39-django-opentracing \
python3dist(django-opentracing)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-opentracing \
python39-six"

inherit rpm
