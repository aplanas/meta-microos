SUMMARY = "An extensible user-registration application for Django"
DESCRIPTION = "This is a user registration application for Django. It requires a \
functional installation of Django, but has no other \
dependencies."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "python39-django-registration-3.3-1.3.noarch.rpm"
RPM_HASH = "04c202a6c696a5fad85473c1c91f10f455410b5536f42a244f6b23ae116eff03548b899da8b7f1ab419dd1d3e178382066733aa64f3049973b13010367b997ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-registration) \
python39-django-registration \
python3dist(django-registration)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-confusable-homoglyphs"

inherit rpm
