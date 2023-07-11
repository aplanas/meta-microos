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

RPM_NAME = "python39-fqdn-1.5.1-2.3.noarch.rpm"
RPM_HASH = "2bc93939456625492a13fc63d4f5a2934cfe882e6d9225ecc8feb29ee5b29f72e686eae4d1343075be20da1eedebf8ea6393c1a2cea0dcf7d36a3f59992c0622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fqdn \
python39-fqdn \
python3dist-fqdn"

RDEPENDS:${PN} += "python-abi"

inherit rpm
