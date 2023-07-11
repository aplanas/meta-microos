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

RPM_NAME = "python39-sorl-thumbnail-12.7.0-6.5.noarch.rpm"
RPM_HASH = "1bff341edf67eeb2edc19c204c4ce5eb11b3d712e2c5d6169beb79ebdff23ed3540bc2b2875dcdc6ca31ae3b6cb0a39a1454032a9f583736f1c87a70adbea858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sorl-thumbnail \
python39-sorl-thumbnail \
python3dist-sorl-thumbnail"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
