SUMMARY = "RFC 3339 functions"
DESCRIPTION = "RFC 3339 functions. \
 - Convert unix timestamps to and from RFC3339. \
 - Either produce RFC3339 strings with a UTC offset (Z) or with the offset \
   that the C time module reports is the local timezone offset. \
 - Avoid timezones as much as possible. \
 - Be very strict and follow RFC3339."
LICENSE = "GPL-3.0-only"

PV = "0.7"

RPM_NAME = "python311-strict-rfc3339-0.7-4.3.noarch.rpm"
RPM_HASH = "f6514902914760d61ee8fe33fa5cd2054b6f95c73043b8c7ee3974c28e4c1502d00cb1d241204eff092ddcfc13cf889584bcb73ec3e716920c4fdad100c52ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-strict-rfc3339 \
python3.11dist-strict-rfc3339 \
python311-strict-rfc3339 \
python3dist-strict-rfc3339"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
