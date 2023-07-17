SUMMARY = "Livereload server in python"
DESCRIPTION = "Reload webpages on changes, without hitting refresh in your browser."
LICENSE = "BSD-2-Clause"

PV = "2.6.3"

RPM_NAME = "python311-livereload-2.6.3-6.1.noarch.rpm"
RPM_HASH = "b83852dcf3b6cd4917ee1dd23fb8e3ac8aa87e31182aaed3b5fa553fc91067555d969ccdd5e313917dbe517f6f5d9b3d3ce35da590375c0a210d3ac3d95632c4"
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
