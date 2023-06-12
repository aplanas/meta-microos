SUMMARY = "Django Template Blocks with extra functionality"
DESCRIPTION = "Django Template Blocks with extra functionality"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-django-sekizai-2.0.0-3.7.noarch.rpm"
RPM_HASH = "453f64adf62de1240bab8089f5740733c5724f54b5e5ee83ee2659fda18a3643c81f407656a64de72a5bbce6c144d930338bb2b7b7116c19a5321b923082da8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-sekizai \
python3.10dist(django-sekizai) \
python310-django-sekizai \
python3dist(django-sekizai)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-django-classy-tags"

inherit rpm
