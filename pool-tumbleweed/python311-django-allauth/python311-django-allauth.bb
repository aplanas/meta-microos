SUMMARY = "Django authentication, registration, account management"
DESCRIPTION = "Integrated set of Django applications addressing authentication, registration, \
account management as well as 3rd party (social) account authentication."
LICENSE = "MIT"

PV = "0.47.0"

RPM_NAME = "python311-django-allauth-0.47.0-1.8.noarch.rpm"
RPM_HASH = "8121c91dd646501ea4022289a2bac8c7bd351f5048f5ae1025092b437ac001a4576df0d07fc030dfee0f12de5d0f6dddae78f272c91f60af2fea92ba95d83378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-allauth \
python311-django-allauth \
python3dist-django-allauth"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-python3-openid \
python311-requests \
python311-requests-oauthlib"

inherit rpm
