SUMMARY = "Media asset management for Python, with glue code for various web frameworks"
DESCRIPTION = "Merges, minifies and compresses Javascript and CSS files, supporting a variety \
of different filters, including YUI, jsmin, jspacker or CSS tidy. Also supports \
URL rewriting in CSS files."
LICENSE = "Apache-2.0 & BSD-2-Clause & LGPL-2.1-only & BSD-3-Clause & MIT"

PV = "2.0"

RPM_NAME = "python39-webassets-2.0-3.11.noarch.rpm"
RPM_HASH = "dbbe03b5f542db940d3a5d48bdf5c62370d91d047badf5037511fef8f91e8347e6c8bb1ec121e4ef088cf5808ee47c4443a0345e3cdaf68a9ff3fe292a5990c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(webassets) \
python39-webassets \
python3dist(webassets)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-setuptools \
update-alternatives"

inherit rpm
