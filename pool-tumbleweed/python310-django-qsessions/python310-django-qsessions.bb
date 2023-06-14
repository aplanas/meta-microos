SUMMARY = "Extended session backends for Django"
DESCRIPTION = "Extended session backends for Django."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-django-qsessions-1.1.4-1.3.noarch.rpm"
RPM_HASH = "87f9b288da8a61f1d622e5cb017aff696579d28faca04dfeed1c34130645f1c1a5995d3f53566b7201a79917726c558478ad7bd950177df299ce0ef92e3e80b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-qsessions \
python3.10dist-django-qsessions \
python310-django-qsessions \
python3dist-django-qsessions"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-ipware \
python310-user-agents"

inherit rpm
