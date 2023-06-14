SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies"
DESCRIPTION = "Small and dependency free `Python`_ package to infer file type and MIME \
type checking the `magic numbers`_ signature of a file or buffer. \
 \
This is a Python port from `filetype`_ Go package."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-filetype-1.2.0-1.4.noarch.rpm"
RPM_HASH = "f1ce2d195643c19ff0579cd726995b61bd80a89c78d417fbefb375eca651703b4f1d49a8f3a93da0577b2dbbc68a5a63608c3292afaffe7674e5aa473aef7f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-filetype \
python3.10dist-filetype \
python310-filetype \
python3dist-filetype"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
