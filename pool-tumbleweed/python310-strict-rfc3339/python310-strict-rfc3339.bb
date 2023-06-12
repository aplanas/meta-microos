SUMMARY = "RFC 3339 functions"
DESCRIPTION = "RFC 3339 functions. \
 - Convert unix timestamps to and from RFC3339. \
 - Either produce RFC3339 strings with a UTC offset (Z) or with the offset \
   that the C time module reports is the local timezone offset. \
 - Avoid timezones as much as possible. \
 - Be very strict and follow RFC3339."
LICENSE = "GPL-3.0-only"

PV = "0.7"

RPM_NAME = "python310-strict-rfc3339-0.7-4.1.noarch.rpm"
RPM_HASH = "a2308cd5854ea6e17e5b1b69617910f2a7771f2596eaa4a9f2ea85f6561c46d78bd44993d6982a84685948707ad04ff5198bc0e4d9d0a491811bc515d4accf21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-strict-rfc3339 \
python3.10dist(strict-rfc3339) \
python310-strict-rfc3339 \
python3dist(strict-rfc3339)"
RDEPENDS:${PN} += "python(abi) \
timezone"

inherit rpm
