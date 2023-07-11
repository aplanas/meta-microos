SUMMARY = "Jinja2 templating language integrated in Django"
DESCRIPTION = "Simple and nonobstructive jinja2 integration with Django."
LICENSE = "BSD-3-Clause"

PV = "2.10.2"

RPM_NAME = "python311-django-jinja-2.10.2-2.1.noarch.rpm"
RPM_HASH = "4f11b4950ceb0afd5462ca4df81ce145cd2b2bdd42f04731938e2ced12381ee3d4228d0a1b06b58f527f9db3e3cc5188f8064e5064d60ec2a0dcfac352638b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-jinja \
python3.11dist-django-jinja \
python311-django-jinja \
python3dist-django-jinja"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Jinja2"

inherit rpm
