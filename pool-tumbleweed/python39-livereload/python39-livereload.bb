SUMMARY = "Livereload server in python"
DESCRIPTION = "Reload webpages on changes, without hitting refresh in your browser."
LICENSE = "BSD-2-Clause"

PV = "2.6.3"

RPM_NAME = "python39-livereload-2.6.3-5.4.noarch.rpm"
RPM_HASH = "1a39f62d5f97fdcaaa68e58349353a8be5832e493d5a188c4933572985fe7f0d781aa37b0eeadfa9473d87936aff336e4890b92149d680a32538116357c8f4dd"
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
