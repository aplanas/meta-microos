SUMMARY = "A Python data validation library"
DESCRIPTION = "Voluptuous is a Python data validation library. It validates data \
coming into Python as JSON, YAML, etc."
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python310-voluptuous-0.13.1-1.5.noarch.rpm"
RPM_HASH = "afd88ede286b9759ba168009c47536e5bf8082fbb04a8d7a02ee083a431f8b19e5c714908a8f78b62037cfb17f64d1dd9f604b1a7af733b72a823461acdb988f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-voluptuous \
python310-voluptuous \
python3dist-voluptuous"

RDEPENDS:${PN} += "python-abi"

inherit rpm
