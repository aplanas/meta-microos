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

RPM_NAME = "python310-sorl-thumbnail-12.7.0-6.5.noarch.rpm"
RPM_HASH = "4133a2038ad3f7d0340b6b6a63726540cea979ff43d916e10d682385661fa63cf19b2baed624c0c49dc99a7a6d016d1b3a3a31cddaa37dde34435cf3fade7659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sorl-thumbnail \
python310-sorl-thumbnail \
python3dist-sorl-thumbnail"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
