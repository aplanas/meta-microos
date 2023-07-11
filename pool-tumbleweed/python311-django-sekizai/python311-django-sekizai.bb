SUMMARY = "Django Template Blocks with extra functionality"
DESCRIPTION = "Django Template Blocks with extra functionality"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-django-sekizai-4.1.0-1.1.noarch.rpm"
RPM_HASH = "bc6bd28289ef2129dd86ddaf4007d1137c64e6eeb476ccb5400ef48563b93de2fc3b0b0c7ba4f4e7cc887c0936835f5afdbf2c75c920b910797152637a9c5df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-sekizai \
python3.11dist-django-sekizai \
python311-django-sekizai \
python3dist-django-sekizai"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-classy-tags"

inherit rpm
