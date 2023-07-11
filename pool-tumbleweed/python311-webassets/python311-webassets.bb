SUMMARY = "Media asset management for Python, with glue code for various web frameworks"
DESCRIPTION = "Merges, minifies and compresses Javascript and CSS files, supporting a variety \
of different filters, including YUI, jsmin, jspacker or CSS tidy. Also supports \
URL rewriting in CSS files."
LICENSE = "Apache-2.0 & BSD-2-Clause & LGPL-2.1-only & BSD-3-Clause & MIT"

PV = "2.0"

RPM_NAME = "python311-webassets-2.0-3.13.noarch.rpm"
RPM_HASH = "430eb8fefef6aa275db8dfcec189a7ad162e24a48a332c821552dd9fc9053882f7bd0827f2bc83515c23de0e8ffa017ee6a5f68719e018ea701f4d0c66cf4998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webassets \
python3.11dist-webassets \
python311-webassets \
python3dist-webassets"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
