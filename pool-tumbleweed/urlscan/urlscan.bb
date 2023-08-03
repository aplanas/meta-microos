SUMMARY = "An other URL extractor/viewer"
DESCRIPTION = "The urlscan utility displays URLs found in an email message with \
the respective context. Selecting an URL uses the Python webbrowser \
module to determine which browser to open. It also supports \
quoted-printable and base64 encoding."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "urlscan-1.0.1-1.1.noarch.rpm"
RPM_HASH = "12d93e153efeb9176a7ce4d3fa46d447264114213ab6d069586c54f2b4677a11479b7086e17d9046c8d3fb0d5ea99b9e73bee93548151b485efdc259664a91c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-urlscan \
python3dist-urlscan \
urlscan"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-base \
python3-urwid"

inherit rpm
