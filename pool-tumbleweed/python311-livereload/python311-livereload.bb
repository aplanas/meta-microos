SUMMARY = "Livereload server in python"
DESCRIPTION = "Reload webpages on changes, without hitting refresh in your browser."
LICENSE = "BSD-2-Clause"

PV = "2.6.3"

RPM_NAME = "python311-livereload-2.6.3-5.4.noarch.rpm"
RPM_HASH = "9ffc9a04896b5a78ccd4230c47cfaf5974867483ed1173d853afd4ef2d3f3e26cd77e6ec33e4588b8864de12fbcee2dfa6783a2139f02122f2084286a4d6c65d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-livereload \
python3.11dist-livereload \
python311-livereload \
python3dist-livereload"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-six \
python311-tornado \
update-alternatives"

inherit rpm
