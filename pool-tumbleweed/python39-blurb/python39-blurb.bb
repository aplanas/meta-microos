SUMMARY = "Command-line tool to manage CPython Misc/NEWS.d entries"
DESCRIPTION = "Command-line tool to manage CPython Misc/NEWS.d entries."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-blurb-1.1.0-2.3.noarch.rpm"
RPM_HASH = "2a41a31b0eb6a2240f16adb8c85f0d4dcc7c935b994b2df9e4bed2e1f5b6fa6b46173e13c0192bd14b345d271177bb2f1767027bdd9374361044d86b355cba11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-blurb \
python39-blurb \
python3dist-blurb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
