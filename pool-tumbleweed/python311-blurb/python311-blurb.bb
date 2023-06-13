SUMMARY = "Command-line tool to manage CPython Misc/NEWS.d entries"
DESCRIPTION = "Command-line tool to manage CPython Misc/NEWS.d entries."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-blurb-1.1.0-2.1.noarch.rpm"
RPM_HASH = "30985982aef651914f6cef9ab8483a05c80f80d61232d27a3cbced7119e585eb5f429fe8640530a52dcfc7aa200677f6c520925f9ed22ab5b8d5edc2b793c764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(blurb) \
python311-blurb \
python3dist(blurb)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
