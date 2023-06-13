SUMMARY = "File identification library for Python"
DESCRIPTION = "File identification library for Python, including license file SPDX identifier."
LICENSE = "MIT"

PV = "2.2.13"

RPM_NAME = "python311-identify-2.2.13-1.9.noarch.rpm"
RPM_HASH = "e96a41e3f4598d0cdb9042a43c6ee150cb0760ae280bf2ffb42f8e2fdf654db070f4d9cad9028c6f2430de524b934b302089c9707ea18485555e35538f66c8ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(identify) \
python311-identify \
python3dist(identify)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
