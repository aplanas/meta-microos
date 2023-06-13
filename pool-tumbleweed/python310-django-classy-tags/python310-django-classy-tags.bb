SUMMARY = "Class based template tags for Django"
DESCRIPTION = "This project creates an altnerate way of writing Django template tags \
which is fully compatible with the current Django templating infrastructure."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-django-classy-tags-3.0.1-1.3.noarch.rpm"
RPM_HASH = "75aec3094c4d5ffc9b113f01aacb5669d3f6dfc6e18f36bb9c4a646f00ca526a28b28735150765acc975e2e6d0ed5a6e406533e94033625790ba55a365049520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-classy-tags \
python3.10dist(django-classy-tags) \
python310-django-classy-tags \
python3dist(django-classy-tags)"

RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
