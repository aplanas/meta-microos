SUMMARY = "Swagger Schema validation"
DESCRIPTION = "Validation tooling for Swagger 2.0 specifications."
LICENSE = "MIT"

PV = "6.14.1"

RPM_NAME = "python310-flex-6.14.1-5.1.noarch.rpm"
RPM_HASH = "c447ebbde5d6f32aa50f4ab442a1e96cbf42af59ad69b04895c4cbb853897fbd10b349483ad1199269557e0e60f150fb61df90704a8e9757c40b2ca85c11bcc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flex \
python3.10dist(flex) \
python310-flex \
python3dist(flex)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-click \
python310-jsonpointer \
python310-requests \
python310-rfc3987 \
python310-six \
python310-strict-rfc3339 \
python310-validate_email \
update-alternatives"

inherit rpm
