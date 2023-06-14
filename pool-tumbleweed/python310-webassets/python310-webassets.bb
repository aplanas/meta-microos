SUMMARY = "Media asset management for Python, with glue code for various web frameworks"
DESCRIPTION = "Merges, minifies and compresses Javascript and CSS files, supporting a variety \
of different filters, including YUI, jsmin, jspacker or CSS tidy. Also supports \
URL rewriting in CSS files."
LICENSE = "Apache-2.0 & BSD-2-Clause & LGPL-2.1-only & BSD-3-Clause & MIT"

PV = "2.0"

RPM_NAME = "python310-webassets-2.0-3.11.noarch.rpm"
RPM_HASH = "4b103bfaf898e7ae25b562c419eaaee8e5c2122e6feb15306c45bbfd64eb68aaca668e0fad31e21b1d22a77101842632a8e10c44566d45f2dfbd0b3eeb07fdf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webassets \
python3.10dist-webassets \
python310-webassets \
python3dist-webassets"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
