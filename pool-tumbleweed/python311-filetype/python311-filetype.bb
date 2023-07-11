SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies"
DESCRIPTION = "Small and dependency free `Python`_ package to infer file type and MIME \
type checking the `magic numbers`_ signature of a file or buffer. \
 \
This is a Python port from `filetype`_ Go package."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-filetype-1.2.0-1.5.noarch.rpm"
RPM_HASH = "12deded8e163b056d41f8b5af0ec65ef71dc5ab863beed9ea3a6f1ad2c41d0bb430a17f8e9a98130e360504943a3fa0bda4b518f4add4422529807856aec786f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-filetype \
python3.11dist-filetype \
python311-filetype \
python3dist-filetype"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
