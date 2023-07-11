SUMMARY = "Simple Django model translations"
DESCRIPTION = "Simple Django model translations without nasty hacks, including admin integration."
LICENSE = "Apache-2.0"

PV = "2.3"

RPM_NAME = "python39-django-parler-2.3-3.5.noarch.rpm"
RPM_HASH = "f80060408bbf236f73f42b5516f56bd3d916d2c123ef8003f7dab72e4c2bf2a4ad672e2aec57ff09f3142d6f08e0431c383cd4c7bdab6bc6402751c2bbfd7f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-parler \
python39-django-parler \
python3dist-django-parler"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
