SUMMARY = "An other URL extractor/viewer"
DESCRIPTION = "The urlscan utility displays URLs found in an email message with \
the respective context. Selecting an URL uses the Python webbrowser \
module to determine which browser to open. It also supports \
quoted-printable and base64 encoding."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "urlscan-1.0.0-1.2.noarch.rpm"
RPM_HASH = "0f10640d72361aa42f7317f5bead3f0e807233ac31be35f6b31b8adb1258a1058dcfa15613a300eb329f4a3372398b777295e484023c31d3cc0c27d25e0e4c01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-urlscan \
python3dist-urlscan \
urlscan"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-base \
python3-urwid"

inherit rpm
