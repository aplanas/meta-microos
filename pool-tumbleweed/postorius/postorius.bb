SUMMARY = "A web user interface for GNU Mailman"
DESCRIPTION = "A web user interface for GNU Mailman"
LICENSE = "GPL-3.0-only"

PV = "1.3.8"

RPM_NAME = "postorius-1.3.8-3.1.noarch.rpm"
RPM_HASH = "be23efb8a5f3bd7adc8d42ef872709be0de368f056ce606e5a710a00c9ba550e5df968a296d7c01506e1b22044270a81b929157aca233e254225293ac220dd25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postorius \
python3-postorius \
python3.11dist-postorius \
python311-postorius \
python3dist-postorius"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-debug-toolbar \
python311-django-mailman3 \
python311-django-requests-debug-toolbar \
python311-mailmanclient \
python311-readme-renderer"

inherit rpm
