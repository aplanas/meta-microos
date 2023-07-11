SUMMARY = "Table/data-grid framework for Django"
DESCRIPTION = "Simplifies the task of turning sets of data into HTML tables. It has native \
support for pagination and sorting. It does for HTML tables what django.forms \
does for HTML forms."
LICENSE = "BSD-2-Clause"

PV = "2.6.0"

RPM_NAME = "python311-django-tables2-2.6.0-1.1.noarch.rpm"
RPM_HASH = "aa0e26883e152a8db74d6cdd7af3514eeb9abc07e77f9aa598e71dda5bdae3c78ad6abad828a1f1956bb6db2a11a434e1ea4666392eb231f23bd51ce0617131f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-tables2 \
python3.11dist-django-tables2 \
python311-django-tables2 \
python3dist-django-tables2"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
