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

RPM_NAME = "python310-fqdn-1.5.1-2.3.noarch.rpm"
RPM_HASH = "bd32216bef995ba6dfe579987c19bda06fbbcb78381da1b88c14704ef4f64cf3fed3acc0c09b00e9a1cf5197314083a5555a493e61caf368b0afecd0136e9afd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fqdn \
python310-fqdn \
python3dist-fqdn"

RDEPENDS:${PN} += "python-abi"

inherit rpm
