SUMMARY = "Extended session backends for Django"
DESCRIPTION = "Extended session backends for Django."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-django-qsessions-1.1.4-1.5.noarch.rpm"
RPM_HASH = "1ad857c0cd6d84ce642f0708b5eb64c4adf2ca84fe126464b8145601a44fb251e2804cba0528d6e540c04545a34a5f4210b5c47c81419d72ce727e6d956bbbca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-qsessions \
python310-django-qsessions \
python3dist-django-qsessions"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-ipware \
python310-user-agents"

inherit rpm
