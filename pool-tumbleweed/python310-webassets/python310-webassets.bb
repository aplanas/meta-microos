SUMMARY = "Media asset management for Python, with glue code for various web frameworks"
DESCRIPTION = "Merges, minifies and compresses Javascript and CSS files, supporting a variety \
of different filters, including YUI, jsmin, jspacker or CSS tidy. Also supports \
URL rewriting in CSS files."
LICENSE = "Apache-2.0 & BSD-2-Clause & LGPL-2.1-only & BSD-3-Clause & MIT"

PV = "2.0"

RPM_NAME = "python310-webassets-2.0-3.13.noarch.rpm"
RPM_HASH = "a0e228777dcf219e419bc4219f3881babd7ee21f50e91d7b1865bb5f0d6c7de00f04132de077f5a225b067d9ab0de3cb9e5b83d58462ca9e90b47ea19af4bf44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-webassets \
python310-webassets \
python3dist-webassets"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
