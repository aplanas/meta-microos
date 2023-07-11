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

RPM_NAME = "python311-sorl-thumbnail-12.7.0-6.5.noarch.rpm"
RPM_HASH = "46bb29ae5b4330a530eb25d9bec903250a08667122a514ecd65f295138822f85cc96c365af0a9ce52f47cd7c324e8a4e003bce113b72bc10b1e6f4e940b70b0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sorl-thumbnail \
python3.11dist-sorl-thumbnail \
python311-sorl-thumbnail \
python3dist-sorl-thumbnail"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
