SUMMARY = "Python HTTP client with async support"
DESCRIPTION = "Python HTTP client with async support."
LICENSE = "BSD-3-Clause"

PV = "0.24.0"

RPM_NAME = "python310-httpx-0.24.0-1.2.noarch.rpm"
RPM_HASH = "103d8a070dfc5513544e7bf94d45687dbfa12d6a70ae5f809a76915a5a128ff250681f00ac30c39dfa0770774788706524497a4e8e3ba4901ed48045a8523fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-httpx \
python310-httpx \
python3dist-httpx"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-certifi \
python310-httpcore \
python310-idna \
python310-sniffio \
update-alternatives"

inherit rpm
