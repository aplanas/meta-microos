SUMMARY = "Multi-byte character string decoder"
DESCRIPTION = "Python library for multi-byte character string decoding."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-mbstrdecoder-1.1.2-1.3.noarch.rpm"
RPM_HASH = "85818bc81271310e95e02d35ce34be7b69b88b01e72dd3244dcd59efdc02d84a344354bdd427fbb5105862a1dac53829907631cafc6e6712c5f998bc9e9fc049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mbstrdecoder \
python39-mbstrdecoder \
python3dist-mbstrdecoder"

RDEPENDS:${PN} += "python-abi \
python39-Faker \
python39-chardet"

inherit rpm
