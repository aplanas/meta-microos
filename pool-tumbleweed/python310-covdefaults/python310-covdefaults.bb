SUMMARY = "Python coverage plugin to provide default settings"
DESCRIPTION = "Python coverage plugin to provide default settings."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-covdefaults-2.3.0-2.3.noarch.rpm"
RPM_HASH = "f76bcc9a9343806e83390ae37f08b7e3356f7ba90773cbb8cc0f4342022ca946a09d8bf7fcaf37cc9c1a87e8bef5f6dfb094f3a779794d208ec1c210861787cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-covdefaults \
python310-covdefaults \
python3dist-covdefaults"

RDEPENDS:${PN} += "python-abi \
python310-coverage"

inherit rpm
