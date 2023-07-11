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

RPM_NAME = "python310-django-picklefield-3.1.0-2.1.noarch.rpm"
RPM_HASH = "343c1108c2e88521fff868d5ea85d9c0fab2a045c9603a755fad118cb29911ad95c8d664b435192f7c28a9d9261e282bc60bf2fc968a47e043ba946a2469e983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-picklefield \
python310-django-picklefield \
python3dist-django-picklefield"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
