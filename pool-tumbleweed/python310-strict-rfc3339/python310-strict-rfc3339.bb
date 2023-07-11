SUMMARY = "RFC 3339 functions"
DESCRIPTION = "RFC 3339 functions. \
 - Convert unix timestamps to and from RFC3339. \
 - Either produce RFC3339 strings with a UTC offset (Z) or with the offset \
   that the C time module reports is the local timezone offset. \
 - Avoid timezones as much as possible. \
 - Be very strict and follow RFC3339."
LICENSE = "GPL-3.0-only"

PV = "0.7"

RPM_NAME = "python310-strict-rfc3339-0.7-4.3.noarch.rpm"
RPM_HASH = "d4f54f6060b54f38dadab970d67fc0ea67da71eab291d5fb5607d3a968c94877c880b1bdd97995db9f8979a159729464c30eaa13aa0adfa616607157ae41ac72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-strict-rfc3339 \
python310-strict-rfc3339 \
python3dist-strict-rfc3339"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
