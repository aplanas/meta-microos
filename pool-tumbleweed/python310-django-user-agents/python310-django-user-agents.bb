SUMMARY = "Django identification of visitors information"
DESCRIPTION = "A django package that allows easy identification of visitor's browser, OS and device information, \
including whether the visitor uses a mobile phone, tablet or a touch capable device. Under the hood, \
it uses `user-agents <https://github.com/selwin/python-user-agents>`_."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-django-user-agents-0.4.0-2.10.noarch.rpm"
RPM_HASH = "b86c21465275edc1d33ec87211a8a0c59cbeb9a4f8321b790f67716838233d435893537d7860738b1a11a7360c05799c163405544b95727b17ab702adfd7d650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-user-agents \
python310-django-user-agents \
python3dist-django-user-agents"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-user-agents"

inherit rpm
