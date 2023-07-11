SUMMARY = "Swagger Schema validation"
DESCRIPTION = "Validation tooling for Swagger 2.0 specifications."
LICENSE = "MIT"

PV = "6.14.1"

RPM_NAME = "python310-flex-6.14.1-5.3.noarch.rpm"
RPM_HASH = "c10b9c7c6ce267749c3b74efa77ab7237bf8302d5dafbe6ab8f33a929be29fb7585c72619f6e65aabf7ecf8344e4056794d7bfffd1895290bf6b62c094a3941a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flex \
python310-flex \
python3dist-flex"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-click \
python310-jsonpointer \
python310-requests \
python310-rfc3987 \
python310-six \
python310-strict-rfc3339 \
python310-validate-email \
update-alternatives"

inherit rpm
