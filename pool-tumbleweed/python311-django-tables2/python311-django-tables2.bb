SUMMARY = "Table/data-grid framework for Django"
DESCRIPTION = "Simplifies the task of turning sets of data into HTML tables. It has native \
support for pagination and sorting. It does for HTML tables what django.forms \
does for HTML forms."
LICENSE = "BSD-2-Clause"

PV = "2.5.3"

RPM_NAME = "python311-django-tables2-2.5.3-1.1.noarch.rpm"
RPM_HASH = "e16adab7fc9c4f91912c8df6d5a92bb8b3f46f9d4c908bc93c34b37b99a0fb94e2d6c1fb2ad74517e30a064986b57d78e7f9b535fd2a4603215e2ce3c4b3ec1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-tables2 \
python311-django-tables2 \
python3dist-django-tables2"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
