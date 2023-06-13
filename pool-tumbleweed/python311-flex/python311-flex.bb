SUMMARY = "Swagger Schema validation"
DESCRIPTION = "Validation tooling for Swagger 2.0 specifications."
LICENSE = "MIT"

PV = "6.14.1"

RPM_NAME = "python311-flex-6.14.1-5.1.noarch.rpm"
RPM_HASH = "6a28b76b318204e27170dbd5961ca19ce242a5c5f8395a6d468d57c18505901e18a517be915b66997b0bccd4e8805344dc5a52d44aee76b979404705a1c9e0b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flex) \
python311-flex \
python3dist(flex)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyYAML \
python311-click \
python311-jsonpointer \
python311-requests \
python311-rfc3987 \
python311-six \
python311-strict-rfc3339 \
python311-validate_email \
update-alternatives"

inherit rpm
