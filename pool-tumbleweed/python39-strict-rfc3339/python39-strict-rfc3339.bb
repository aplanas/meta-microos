SUMMARY = "RFC 3339 functions"
DESCRIPTION = "RFC 3339 functions. \
 - Convert unix timestamps to and from RFC3339. \
 - Either produce RFC3339 strings with a UTC offset (Z) or with the offset \
   that the C time module reports is the local timezone offset. \
 - Avoid timezones as much as possible. \
 - Be very strict and follow RFC3339."
LICENSE = "GPL-3.0-only"

PV = "0.7"

RPM_NAME = "python39-strict-rfc3339-0.7-4.3.noarch.rpm"
RPM_HASH = "e4a3c7369dfa12dd2bd744e5f159b432e953a0bb2c13beeeefefa2cdaf76793e902f06589e3cd9daaaf1371d8b097c120eae0f52b22f5566fb28972ae477750f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-strict-rfc3339 \
python39-strict-rfc3339 \
python3dist-strict-rfc3339"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
