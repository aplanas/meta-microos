SUMMARY = "Command-line tool to manage CPython Misc/NEWS.d entries"
DESCRIPTION = "Command-line tool to manage CPython Misc/NEWS.d entries."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-blurb-1.1.0-2.1.noarch.rpm"
RPM_HASH = "f21e27edf9128b2e5c669cad25c56bc5806f97ea8501dc9df47c910d0fd88abe546158e1f45cb3cee6a145842bfd6a95b9d8cc28a8bac238fcaddd79960d6367"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blurb \
python3.10dist(blurb) \
python310-blurb \
python3dist(blurb)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
