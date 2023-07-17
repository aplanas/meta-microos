SUMMARY = "Livereload server in python"
DESCRIPTION = "Reload webpages on changes, without hitting refresh in your browser."
LICENSE = "BSD-2-Clause"

PV = "2.6.3"

RPM_NAME = "python310-livereload-2.6.3-6.1.noarch.rpm"
RPM_HASH = "f018212f3d0565d53b91ed8f55d80a57ad45cdb63a9e1d53f2467478f1e9d8f3f6f40cbb3412a26fa7fd59b4cd129232e81100963da1583468878d0c21c3d63d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-livereload \
python310-livereload \
python3dist-livereload"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
python310-tornado \
update-alternatives"

inherit rpm
