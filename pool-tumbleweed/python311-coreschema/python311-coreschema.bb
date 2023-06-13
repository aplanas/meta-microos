SUMMARY = "Core Schema for Core API"
DESCRIPTION = "Core Schema for Core API, a format-independent Document Object Model for \
representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "0.0.4"

RPM_NAME = "python311-coreschema-0.0.4-1.16.noarch.rpm"
RPM_HASH = "3b571d73f7204bc90e91495056925fce950b8d893c9337a8307128aeaf4eeb613cd2e985bb4575082eb74fc907748238569b964bb63af7213e981333fcc04fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(coreschema) \
python311-coreschema \
python3dist(coreschema)"

RDEPENDS:${PN} += "python(abi) \
python311-Jinja2"

inherit rpm
