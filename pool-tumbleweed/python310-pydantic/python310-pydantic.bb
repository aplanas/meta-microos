SUMMARY = "Data validation and settings management using python type hinting"
DESCRIPTION = "Data validation and settings management using Python type hinting."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "python310-pydantic-1.10.8-1.1.noarch.rpm"
RPM_HASH = "5bd4cb68e7bfdf74aaea4008e8cb742e19b6b98cc9b423d0a00a4e37d088ef0031486a925bc27a070fa27351aeb5eafe9679ff5a86273a856659a19bd3a4e33e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydantic \
python3.10dist(pydantic) \
python310-pydantic \
python3dist(pydantic)"
RDEPENDS:${PN} += "python(abi) \
python310-typing_extensions"

inherit rpm
