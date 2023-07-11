SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies"
DESCRIPTION = "Small and dependency free `Python`_ package to infer file type and MIME \
type checking the `magic numbers`_ signature of a file or buffer. \
 \
This is a Python port from `filetype`_ Go package."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-filetype-1.2.0-1.5.noarch.rpm"
RPM_HASH = "94cad5767e18bf1f6d87dedae47c45bd8899dcfd06b7b72fc9ca422ae2e71c25d43458ce4634d6ae91bc4cc1b8175e39678705597dd139506826921c627f1369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-filetype \
python310-filetype \
python3dist-filetype"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
