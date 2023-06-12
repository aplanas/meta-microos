SUMMARY = "Country-specific Django helpers"
DESCRIPTION = "Country-specific Django helpers."
LICENSE = "BSD-3-Clause"

PV = "4.0"

RPM_NAME = "python311-django-localflavor-4.0-1.1.noarch.rpm"
RPM_HASH = "bb29e7fc22d4aec5e7c2ee99839b15d9a9e3b84e96b22a66480e956072987ed0431c0698cc1c354df4ec5d341b551c8c8271ce1e0bb4e71b646f121b058a13a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-localflavor) \
python311-django-localflavor \
python3dist(django-localflavor)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-python-stdnum"

inherit rpm
