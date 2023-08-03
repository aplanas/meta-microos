SUMMARY = "Documentation for Crash"
DESCRIPTION = "This subpackage contains the crash whitepaper from Dave Anderson. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GFDL-1.2-only"

PV = "8.0.3"

RPM_NAME = "crash-doc-8.0.3-1.13.aarch64.rpm"
RPM_HASH = "b8224e7717619ddd9e39382d91bb402cac9a4b597c6e11fed560da59958f8fdd6422b7b72eb49eae9aaf7014dbffcac9d01f715de7b637a1dfb252db4f743544"

RPROVIDES:${PN} += "crash-doc"

RDEPENDS:${PN} += "crash"

inherit rpm
