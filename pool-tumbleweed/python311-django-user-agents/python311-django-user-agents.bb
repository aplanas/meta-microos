SUMMARY = "Django identification of visitors information"
DESCRIPTION = "A django package that allows easy identification of visitor's browser, OS and device information, \
including whether the visitor uses a mobile phone, tablet or a touch capable device. Under the hood, \
it uses `user-agents <https://github.com/selwin/python-user-agents>`_."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-django-user-agents-0.4.0-2.10.noarch.rpm"
RPM_HASH = "b18bcb686a302af3337b1fd25268b673161da9e9b3fdc78a26d004fa4dab6b226b4109b64b2d8bdd63bb194bf4cbd9accf3debe93df82a8a0f0611f590d4a5d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-user-agents \
python3.11dist-django-user-agents \
python311-django-user-agents \
python3dist-django-user-agents"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-user-agents"

inherit rpm
