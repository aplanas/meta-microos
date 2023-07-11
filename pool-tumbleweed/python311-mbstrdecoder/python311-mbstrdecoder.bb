SUMMARY = "Multi-byte character string decoder"
DESCRIPTION = "Python library for multi-byte character string decoding."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-mbstrdecoder-1.1.2-1.3.noarch.rpm"
RPM_HASH = "8c9c3f401b34d273039e65a4a932191dfaf8b9e34acec91105fb89e865337c9277844cb5029c114f37b11bfb91253809334d48284e3f6585c7295cad8e14e505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mbstrdecoder \
python3.11dist-mbstrdecoder \
python311-mbstrdecoder \
python3dist-mbstrdecoder"

RDEPENDS:${PN} += "python-abi \
python311-Faker \
python311-chardet"

inherit rpm
