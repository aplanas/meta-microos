SUMMARY = "Livereload server in python"
DESCRIPTION = "Reload webpages on changes, without hitting refresh in your browser."
LICENSE = "BSD-2-Clause"

PV = "2.6.3"

RPM_NAME = "python39-livereload-2.6.3-6.1.noarch.rpm"
RPM_HASH = "77f6e1a8d290fe960ecc115d606f3323bcd6a53b41a12b53a8096c41af1225ff42ea24684b3db24e41878eb4fc64718719bb368fcd1c155729824730631dc0fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-livereload \
python39-livereload \
python3dist-livereload"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-six \
python39-tornado \
update-alternatives"

inherit rpm
