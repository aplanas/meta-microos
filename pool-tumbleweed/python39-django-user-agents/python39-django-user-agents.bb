SUMMARY = "Django identification of visitors information"
DESCRIPTION = "A django package that allows easy identification of visitor's browser, OS and device information, \
including whether the visitor uses a mobile phone, tablet or a touch capable device. Under the hood, \
it uses `user-agents <https://github.com/selwin/python-user-agents>`_."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-django-user-agents-0.4.0-2.10.noarch.rpm"
RPM_HASH = "83528ac1bc3dffe4eb545b59e0c51bd72b8c03645f4df0990d454e5454286b528e2bdeccc63d4e04857341a4877d958416665d8705e4b760ddcdfbc45987844e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-user-agents \
python39-django-user-agents \
python3dist-django-user-agents"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-user-agents"

inherit rpm
