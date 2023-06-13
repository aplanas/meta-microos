SUMMARY = "Pluggable search for Django"
DESCRIPTION = "Pluggable search for Django."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-django-haystack-3.2.1-1.4.noarch.rpm"
RPM_HASH = "d0fd8281e0c835baa903ec078fb79cc5e76eac841c408367cd03defad345cc95568e96991c183ff3eb8dbd9f4275f70193bf8cf21b4adac2fb8710f47086d572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-haystack) \
python39-django-haystack \
python3dist(django-haystack)"

RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
