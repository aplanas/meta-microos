SUMMARY = "YUI CSS compression algorithm"
DESCRIPTION = "This is a Python port of the YUI CSS Compressor."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.2.0"

RPM_NAME = "python39-cssmin-0.2.0-1.5.noarch.rpm"
RPM_HASH = "a5cc4b7c5730fd21f96efafcca771e64b8a5a4eb09520123b3afc57323c3fda31699c1cac7442f9e480365fc0d3c5acec0f2d8fe0d9ef09d063c52ff3de1544f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cssmin \
python39-cssmin \
python3dist-cssmin"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
