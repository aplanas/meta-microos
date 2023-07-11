SUMMARY = "Multi-byte character string decoder"
DESCRIPTION = "Python library for multi-byte character string decoding."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-mbstrdecoder-1.1.2-1.3.noarch.rpm"
RPM_HASH = "93530358eb4acf63246a4817b961e23deec2e24e308bf88b27b5f7867be4fec256b422ea992cbf1eb0c39cc29cc972b5513956242dd385504dc2f8c61e71c67f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mbstrdecoder \
python310-mbstrdecoder \
python3dist-mbstrdecoder"

RDEPENDS:${PN} += "python-abi \
python310-Faker \
python310-chardet"

inherit rpm
