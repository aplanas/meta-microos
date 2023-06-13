SUMMARY = "RFC-compliant FQDN validation and manipulation for Python"
DESCRIPTION = "This package validates Fully Qualified Domain Names (FQDNs) conforming to the \
Internet Engineering Task Force specification . The design intent is to \
validate that a string would be traditionally acceptable as a public Internet \
hostname to RFC-conforming software, which is a strict subset of the logic in \
modern web browsers like Mozilla Firefox and Chromium that determines whether \
make a DNS lookup. Configuration options can relax constraints so that short \
hostnames without periods or others with underscores will be valid. These \
relaxations are closer to how modern web browsers work."
LICENSE = "MPL-2.0"

PV = "1.5.1"

RPM_NAME = "python39-fqdn-1.5.1-2.1.noarch.rpm"
RPM_HASH = "3f74d5426a94e563e91195e1680796215889fc2ab979e2b2cf066a7cbf7ce4f668d800eec8c0e3a6504b34c66978b2ff63ef065dc9608480b5e97c72a8d8f50d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fqdn) \
python39-fqdn \
python3dist(fqdn)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
