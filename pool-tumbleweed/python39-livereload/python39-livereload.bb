SUMMARY = "Livereload server in python"
DESCRIPTION = "Reload webpages on changes, without hitting refresh in your browser."
LICENSE = "BSD-2-Clause"

PV = "2.6.3"

RPM_NAME = "python39-livereload-2.6.3-5.2.noarch.rpm"
RPM_HASH = "1091e856f4203ebfa6467a80fad75632ebb37ff2b1c6158d95495360edc17ea3e26e94bc85f7804e2a064d082d24c3404974541aabba3406cd1cf45c40321f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-livereload \
python39-livereload \
python3dist-livereload"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-six \
python39-tornado \
update-alternatives"

inherit rpm
