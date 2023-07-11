SUMMARY = "Simple Django model translations"
DESCRIPTION = "Simple Django model translations without nasty hacks, including admin integration."
LICENSE = "Apache-2.0"

PV = "2.3"

RPM_NAME = "python311-django-parler-2.3-3.5.noarch.rpm"
RPM_HASH = "b44b8dd3096a5d84bef33921ad3de3503e7f4bfa81232a74bf7b5fdb4368bc2919003d6eef70038497ee78e6aed55efe5439608dfa2b508e92d7ac362a81b4dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-parler \
python3.11dist-django-parler \
python311-django-parler \
python3dist-django-parler"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
