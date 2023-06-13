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

RPM_NAME = "python311-fqdn-1.5.1-2.1.noarch.rpm"
RPM_HASH = "0c8475e4a08e37330eb87de0cfccaa4ded5c42c9ded7f105a48927b7ec7a3397b665396de58f120d6abce02e73b2be559e1a0f67aa6cf29e64c1ba5dd5857f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fqdn) \
python311-fqdn \
python3dist(fqdn)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
