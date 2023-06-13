SUMMARY = "Django identification of visitors information"
DESCRIPTION = "A django package that allows easy identification of visitor's browser, OS and device information, \
including whether the visitor uses a mobile phone, tablet or a touch capable device. Under the hood, \
it uses `user-agents <https://github.com/selwin/python-user-agents>`_."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-django-user-agents-0.4.0-2.8.noarch.rpm"
RPM_HASH = "51a79daa2d2b85b55314e0b7ecd8354362c8bfe459721a80b8d86cd356e10eccdd7687f17a39fd6bb8b6cc5d9334257dd921b12496b3c147d79b6a19344e5fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-user-agents \
python3.10dist(django-user-agents) \
python310-django-user-agents \
python3dist(django-user-agents)"

RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-user-agents"

inherit rpm
