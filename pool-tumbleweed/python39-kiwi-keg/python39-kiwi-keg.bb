SUMMARY = "KEG - Image Composition Tool"
DESCRIPTION = "KEG is an image composition tool for KIWI image descriptions"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "python39-kiwi-keg-2.1.0-1.1.noarch.rpm"
RPM_HASH = "93f1adc18a79658bc6b3f16419889c3537a14cb76c596cfb94dfc6c8df070fd29cb0a450a2276e896ba64a555dc1ec153f535e4c682d641f64b3255f1bc0b214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kiwi-keg \
python3.9dist-kiwi-keg \
python39-kiwi-keg \
python3dist-kiwi-keg"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python3-kiwi \
python39-Jinja2 \
python39-PyYAML \
python39-docopt \
python39-schema"

inherit rpm
