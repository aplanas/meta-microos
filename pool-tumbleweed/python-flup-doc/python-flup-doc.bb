SUMMARY = "Documentation for python-flup"
DESCRIPTION = "This package contains HTML documentation for python-flup."
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python-flup-doc-1.0.3.dev20161029-3.1.noarch.rpm"
RPM_HASH = "365d9e09f96aaaad773f34b610accd0a10be2ea8acf98e3afbb1ec7269dc99d5ccd36cdf7440cc81a72a52c3d86b2b7fb416a0f53d0549d9b45f4deb0d4c315f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-flup-doc \
python310-flup-doc \
python311-flup-doc \
python39-flup-doc"

RDEPENDS:${PN} += ""

inherit rpm
