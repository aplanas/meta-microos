SUMMARY = "An HTML Minifier"
DESCRIPTION = "A configurable HTML Minifier with safety features."
LICENSE = "BSD-3-Clause"

PV = "0.1.12"

RPM_NAME = "python311-htmlmin-0.1.12-3.15.noarch.rpm"
RPM_HASH = "1faff5f1908b69fb3ebe5542211dc8a9785ad5fe649bb8de6b190bc6ac761172f6291caaadbaa19ad2e5bc9a00f6b729e83795b31b45542fedc50168634b4ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-htmlmin \
python3.11dist-htmlmin \
python311-htmlmin \
python3dist-htmlmin"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
