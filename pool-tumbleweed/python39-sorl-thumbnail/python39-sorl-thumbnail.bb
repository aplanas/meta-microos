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

RPM_NAME = "python39-sorl-thumbnail-12.7.0-6.3.noarch.rpm"
RPM_HASH = "12cd23bfdb683ba95b4a231d701aba085ac203ee7c0b31691e6f0dd2f833e9b1f1a91af9ad8d3faa23cab8b2f83e0abce6e9a44e038486f3ff230b340d6b6d0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sorl-thumbnail \
python39-sorl-thumbnail \
python3dist-sorl-thumbnail"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
