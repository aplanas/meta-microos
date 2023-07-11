SUMMARY = "Library for querying the DuckDuckGo API"
DESCRIPTION = "A Python library for querying the DuckDuckGo API."
LICENSE = "BSD-3-Clause"

PV = "0.242"

RPM_NAME = "python311-duckduckgo2-0.242-3.14.noarch.rpm"
RPM_HASH = "4d71f429e29f7e83af259a89c6bbb9d7ee5c15f3202a8354a19659c907535bc63e5ce1a453f32fc3a0f7de8fdb244188e5478c95e0c3c96c682642938578c415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-duckduckgo2 \
python3.11dist-duckduckgo2 \
python311-duckduckgo2 \
python3dist-duckduckgo2"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
