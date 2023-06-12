SUMMARY = "Multi-byte character string decoder"
DESCRIPTION = "Python library for multi-byte character string decoding."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-mbstrdecoder-1.1.2-1.1.noarch.rpm"
RPM_HASH = "e99d39da29025aa792ca6cce9d6cab6ba34448059f0c4ab4c5e56e9cc7bf89d4f33abca38b2f67f91941fc0fd00754c9ca8d2b8999699458dc66399b02a5c90b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mbstrdecoder) \
python311-mbstrdecoder \
python3dist(mbstrdecoder)"
RDEPENDS:${PN} += "python(abi) \
python311-Faker \
python311-chardet"

inherit rpm
