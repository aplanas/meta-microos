SUMMARY = "Thumbnails for Django"
DESCRIPTION = "Thumbnails for Django. \
 \
Features at a glance \
--------------------- \
- Storage support \
- Pluggable Engine support (PIL, pgmagick) \
- Pluggable Key Value Store support (redis, cached db) \
- Pluggable Backend support \
- Admin integration with possibility to delete \
- Dummy generation \
- Flexible, simple syntax, generates no html \
- ImageField for model that deletes thumbnails \
- CSS style cropping options \
- Margin calculation for vertical positioning"
LICENSE = "BSD-3-Clause"

PV = "12.7.0"

RPM_NAME = "python311-sorl-thumbnail-12.7.0-6.3.noarch.rpm"
RPM_HASH = "c7569b06f4dd7e3c5d9931fc65f212efa3c0599347478feedaec71a269a64d34e6a1ab811906f89a80487e7ce79152997ec7acd9cb942e32d9edb3987eb65238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sorl-thumbnail) \
python311-sorl-thumbnail \
python3dist(sorl-thumbnail)"

RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
