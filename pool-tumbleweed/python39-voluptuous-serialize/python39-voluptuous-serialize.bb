SUMMARY = "Python module to convert voluptuous schemas to dictionaries"
DESCRIPTION = "A Python module to convert voluptuous schemas to dictionaries."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python39-voluptuous-serialize-2.5.0-1.3.noarch.rpm"
RPM_HASH = "619d4a5ab91ea6ece1b2d708e217fbb7a5808b762a2fb19999fd5a2763c21a5377b018d6234eedfa37554a8da6763ae59c485243269a86a03cfdf3a16281992c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(voluptuous-serialize) \
python39-voluptuous-serialize \
python3dist(voluptuous-serialize)"
RDEPENDS:${PN} += "python(abi) \
python39-voluptuous"

inherit rpm
