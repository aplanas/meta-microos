SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies"
DESCRIPTION = "Small and dependency free `Python`_ package to infer file type and MIME \
type checking the `magic numbers`_ signature of a file or buffer. \
 \
This is a Python port from `filetype`_ Go package."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-filetype-1.2.0-1.4.noarch.rpm"
RPM_HASH = "fde09404130faffc4c169f0c0209348a57e627798f765ef89401ed529d25945664dd41aba219f44a71f5f38fd42341798d53fe245cac462441b89071bfd12de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(filetype) \
python311-filetype \
python3dist(filetype)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
