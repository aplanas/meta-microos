SUMMARY = "A language for matching/validating/filtering Python dictionaries"
DESCRIPTION = "The kmatch library provides a language for matching Python \
dictionaries. Patterns are specified as lists of filters combined \
with logical operators."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-kmatch-0.4.0-2.5.noarch.rpm"
RPM_HASH = "44d19e9de6f02d0b95b98cd00a6c32bcc49dd5fa3a5a3051e0765b5e61235c8af85615ee94e5ac9187a29cf96337111af913a7092647424066981c56a931e62a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kmatch \
python3.11dist-kmatch \
python311-kmatch \
python3dist-kmatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
