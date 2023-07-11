SUMMARY = "Django Template Blocks with extra functionality"
DESCRIPTION = "Django Template Blocks with extra functionality"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-django-sekizai-4.1.0-1.1.noarch.rpm"
RPM_HASH = "d079b7abeefbed1d50762616c976d8ab765421b477fca7ea29cc8891a21759d4bf1b6a251c264e39147d3f573a06b377616a25243f870b55cbe6dbde868535f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-sekizai \
python310-django-sekizai \
python3dist-django-sekizai"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-classy-tags"

inherit rpm
