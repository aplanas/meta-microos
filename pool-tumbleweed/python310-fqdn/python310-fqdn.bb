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

RPM_NAME = "python310-fqdn-1.5.1-2.1.noarch.rpm"
RPM_HASH = "2cc684b8486b53f7d3ccbea44d8d9b1daee08329a8cf19de932c1391d48f84e160c0070446047c6048297eb30cb6476249bc0a61ae8130b04f8a21aabdbd3b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fqdn \
python3.10dist(fqdn) \
python310-fqdn \
python3dist(fqdn)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
