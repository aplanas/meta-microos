SUMMARY = "Country-specific Django helpers"
DESCRIPTION = "Country-specific Django helpers."
LICENSE = "BSD-3-Clause"

PV = "4.0"

RPM_NAME = "python311-django-localflavor-4.0-1.3.noarch.rpm"
RPM_HASH = "eb48f7c452d675df22c823ed4d2435974c8e7fbcf3775078899708372d46f60c1d7158f4f5f7d73ff14d2f0f0cabc1e20f60e8f9266bcf021fb1d514955913c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-localflavor \
python3.11dist-django-localflavor \
python311-django-localflavor \
python3dist-django-localflavor"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-python-stdnum"

inherit rpm
