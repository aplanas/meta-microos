SUMMARY = "Class based template tags for Django"
DESCRIPTION = "This project creates an altnerate way of writing Django template tags \
which is fully compatible with the current Django templating infrastructure."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-django-classy-tags-3.0.1-1.3.noarch.rpm"
RPM_HASH = "6054c1c31b0394027ae24ac918ec2690011d52cdfb0d2a96d2c46c21aae6da1d3cf4910ab16c9705db238258164f2dc3b77e91ca733d31bdc07532e9453e5e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-classy-tags) \
python311-django-classy-tags \
python3dist(django-classy-tags)"

RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
