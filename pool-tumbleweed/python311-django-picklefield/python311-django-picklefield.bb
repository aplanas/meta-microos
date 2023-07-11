SUMMARY = "Pickled object field for Django"
DESCRIPTION = "django-picklefield provides an implementation of a pickled object field. \
Such fields can contain any picklable objects. \
 \
The implementation is taken and adopted from Django snippet #1694 \
<http://www.djangosnippets.org/snippets/1694/> by Taavi Taijala, which is in \
turn based on Django snippet #513 <http://www.djangosnippets.org/snippets/513/> \
by Oliver Beattie."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-django-picklefield-3.1.0-2.1.noarch.rpm"
RPM_HASH = "fcb8efa2dba8a7bc565bbd147245d03b35af40a44574289d89087edede95f1d7cb6b979fba73b81feb05c6e218693ae13fa54acb10a168a7ec4b27ee96a119ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-picklefield \
python3.11dist-django-picklefield \
python311-django-picklefield \
python3dist-django-picklefield"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
