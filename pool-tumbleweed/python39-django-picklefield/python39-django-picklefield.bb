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

RPM_NAME = "python39-django-picklefield-3.1.0-2.1.noarch.rpm"
RPM_HASH = "f1806fa2e8da583abf43ac062554f49393f13932a9ac84036251b5bfd2ab8a986133c105e2315d7441420713f12465df5fb59912b2ed9df513df1d18ad498186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-picklefield \
python39-django-picklefield \
python3dist-django-picklefield"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
