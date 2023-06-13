SUMMARY = "Structured Pipfile and Pipfile.lock models"
DESCRIPTION = "Structured Pipfile and Pipfile.lock models."
LICENSE = "ISC"

PV = "0.4.4"

RPM_NAME = "python310-plette-0.4.4-1.3.noarch.rpm"
RPM_HASH = "badf8b4223453c1eace62e152ebe7c948c01bd602fe589862949b38ffd140481b2951d52b4a5b75fbfbcda6ee1c8fdd076f94ecdca72b15912123cf91c97679e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plette \
python3.10dist(plette) \
python310-plette \
python3dist(plette)"

RDEPENDS:${PN} += "python(abi) \
python310-tomlkit"

inherit rpm
