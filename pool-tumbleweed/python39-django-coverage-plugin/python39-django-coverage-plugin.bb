SUMMARY = "Django template coveragepy plugin"
DESCRIPTION = "Django template coverage.py plugin"
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-django-coverage-plugin-3.0.0-2.1.noarch.rpm"
RPM_HASH = "669d6abd2269e1b55b88f13eede5d9d323941c17f0fde51603d0e50f777d521f446a1beab1a8825c55f2adc22686a737a06f5658c6e2b6e72f848883dbb38c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-coverage-plugin) \
python39-django-coverage-plugin \
python39-django_coverage_plugin \
python3dist(django-coverage-plugin)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-coverage"

inherit rpm
