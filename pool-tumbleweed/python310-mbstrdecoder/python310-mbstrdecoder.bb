SUMMARY = "Multi-byte character string decoder"
DESCRIPTION = "Python library for multi-byte character string decoding."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-mbstrdecoder-1.1.2-1.1.noarch.rpm"
RPM_HASH = "2aa0642c188a0835d25c2f6208d88e66b7cb09e23e166b53841712596cf8111920b2da7ab77649ccc691661a5a3c1b1041dd9b15aa74180e977ad0526339d43f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mbstrdecoder \
python3.10dist(mbstrdecoder) \
python310-mbstrdecoder \
python3dist(mbstrdecoder)"

RDEPENDS:${PN} += "python(abi) \
python310-Faker \
python310-chardet"

inherit rpm
