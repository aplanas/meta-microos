SUMMARY = "Django Template Blocks with extra functionality"
DESCRIPTION = "Django Template Blocks with extra functionality"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python39-django-sekizai-4.1.0-1.1.noarch.rpm"
RPM_HASH = "9ebdaaa2d529a1d005849e9989d262c0ac082dc049bf60479fa10807f4af2be6a607be53f146652bdccff7c85c5c76b25912c89b9e0f0aaadcbc2b30e4806c08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-sekizai \
python39-django-sekizai \
python3dist-django-sekizai"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-classy-tags"

inherit rpm
