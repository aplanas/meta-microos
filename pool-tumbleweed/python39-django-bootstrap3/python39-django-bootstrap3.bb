SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "14.2.0"

RPM_NAME = "python39-django-bootstrap3-14.2.0-2.6.noarch.rpm"
RPM_HASH = "0efc3e5f991fa17c4503dad8578579f7a2ec35f7c310dba8790a16b220bd5ad1cf11e7d343247c5d974d3f5f80e86d8231f24a94346b35032540c9483416f708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-bootstrap3 \
python39-django-bootstrap3 \
python3dist-django-bootstrap3"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
