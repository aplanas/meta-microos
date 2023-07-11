SUMMARY = "Media asset management for Python, with glue code for various web frameworks"
DESCRIPTION = "Merges, minifies and compresses Javascript and CSS files, supporting a variety \
of different filters, including YUI, jsmin, jspacker or CSS tidy. Also supports \
URL rewriting in CSS files."
LICENSE = "Apache-2.0 & BSD-2-Clause & LGPL-2.1-only & BSD-3-Clause & MIT"

PV = "2.0"

RPM_NAME = "python39-webassets-2.0-3.13.noarch.rpm"
RPM_HASH = "4342c8bb01e683d6ad3e87c42bc259a003f3ed5d68eaede2680096e3d3e361c133312d52de9bfbf2ff1360c90363b85386a373690c95a162aee7079cc4d59901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-webassets \
python39-webassets \
python3dist-webassets"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
