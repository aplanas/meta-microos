SUMMARY = "Swagger Schema validation"
DESCRIPTION = "Validation tooling for Swagger 2.0 specifications."
LICENSE = "MIT"

PV = "6.14.1"

RPM_NAME = "python39-flex-6.14.1-5.1.noarch.rpm"
RPM_HASH = "ed1557514d4119c6c88738ec4d3b53ea7f41ce0d9aa531389730aded6ce1044568a49c182c12ecd26daa7bc1624ebe4fd4bc88024275ab9910a72c311c5d5492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flex \
python39-flex \
python3dist-flex"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-PyYAML \
python39-click \
python39-jsonpointer \
python39-requests \
python39-rfc3987 \
python39-six \
python39-strict-rfc3339 \
python39-validate-email \
update-alternatives"

inherit rpm
