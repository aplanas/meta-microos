SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python311-psutil-5.9.5-3.1.aarch64.rpm"
RPM_HASH = "23a2f7e8f01e7f1897e294bfaf60fb8a9af9acfac5d677895f401e40b7852407f1cb7bd4ed59151bcdd22ddb778b0e2688efadf04e39faf170471f088854be5d"

RPROVIDES:${PN} += "python3-psutil \
python3.11dist-psutil \
python311-psutil \
python3dist-psutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
procps \
python-abi"

inherit rpm
