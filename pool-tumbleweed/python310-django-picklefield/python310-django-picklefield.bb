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

RPM_NAME = "python310-django-picklefield-3.1.0-1.3.noarch.rpm"
RPM_HASH = "34209f6353b62f8d96c7bcdf5b7d1e129f7e1a5ecaef579dab5c650c0d783197f212f4b05abc8e039ea25a8da569bccea2d6bc599863a38935e615a1443e38f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-picklefield \
python3.10dist(django-picklefield) \
python310-django-picklefield \
python3dist(django-picklefield)"

RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
