SUMMARY = "Spying framework"
DESCRIPTION = "Mockito is a spying framework originally based on the Java library with the same name."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-mockito-1.4.0-1.5.noarch.rpm"
RPM_HASH = "142948caea20be3f5645602e83f0585073d1aa896184b4e76cf9c7dad986cae18f6ea5202df6f3b647bd833e08c19ad5d4827ed3a9e9dd4f462ca94de09836a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mockito \
python310-mockito \
python3dist-mockito"

RDEPENDS:${PN} += "python-abi"

inherit rpm
