SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies"
DESCRIPTION = "Small and dependency free `Python`_ package to infer file type and MIME \
type checking the `magic numbers`_ signature of a file or buffer. \
 \
This is a Python port from `filetype`_ Go package."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-filetype-1.2.0-1.5.noarch.rpm"
RPM_HASH = "e41dd8b9320cf7f3253d1b45f0fdef8ef62141bd32a64dc7579aeea793445311fb2294a9c761d868cf9157026f6119e802c10e03c54587fa1171a67cac9cf063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-filetype \
python39-filetype \
python3dist-filetype"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
