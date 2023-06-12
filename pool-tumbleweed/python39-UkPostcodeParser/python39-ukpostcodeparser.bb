SUMMARY = "UK Postcode parser"
DESCRIPTION = "United Kingdom Postcode parser."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-UkPostcodeParser-1.1.2-4.1.noarch.rpm"
RPM_HASH = "35bae4c70d48344d54f54c528280b4e0c5efffd2239fbf141342516f83cfd00cca3c5e31a1f9f8e7df611043fc891de03881df603128e3db8f52df143cb26581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ukpostcodeparser) \
python39-UkPostcodeParser \
python3dist(ukpostcodeparser)"
RDEPENDS:${PN} += "python(abi) \
python39-base"

inherit rpm
