SUMMARY = "Simple Django model translations"
DESCRIPTION = "Simple Django model translations without nasty hacks, including admin integration."
LICENSE = "Apache-2.0"

PV = "2.3"

RPM_NAME = "python39-django-parler-2.3-3.3.noarch.rpm"
RPM_HASH = "7a647e63d3ae896173263d09b01483b515d2fbc726a5afff9673eafa1411c746c3f15634c7188792ff461db2387f0379abd6b5cb91e7c404a31fd0c5cbf20da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-parler) \
python39-django-parler \
python3dist(django-parler)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
