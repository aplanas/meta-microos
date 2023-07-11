SUMMARY = "Examples from the BPF Compiler Collection"
DESCRIPTION = "Python and C examples from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-examples-0.26.0-2.11.noarch.rpm"
RPM_HASH = "8e55b91b56fa604d074db7b4ca785a8f1f64ad585fb5a0ea4695891f31b5637a26c7f7c897fe21dbeea872c66f9877e9f1453d30058d4a7a280835400e2b678a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcc-examples"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python3-bcc \
python3-future"

inherit rpm
