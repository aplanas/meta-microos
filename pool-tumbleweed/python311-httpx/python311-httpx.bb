SUMMARY = "Python HTTP client with async support"
DESCRIPTION = "Python HTTP client with async support."
LICENSE = "BSD-3-Clause"

PV = "0.24.0"

RPM_NAME = "python311-httpx-0.24.0-1.1.noarch.rpm"
RPM_HASH = "b9b8d31be65f808fa7e773beeaeb2d95bb3c08e90dd5316cc1c36942db7eb1590a510f10e44c67a21103420ac30ea533e283dbc4c359eb5b6dde4965765b74cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-httpx \
python311-httpx \
python3dist-httpx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-certifi \
python311-httpcore \
python311-idna \
python311-sniffio \
update-alternatives"

inherit rpm
