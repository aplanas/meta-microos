SUMMARY = "Files for Developing with f2c"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20210928"

RPM_NAME = "f2c-devel-20210928-1.3.aarch64.rpm"
RPM_HASH = "443cbb6308bda27676bf177c2e3c2f6f9475f1e8daf6d843debf182afda897b6693106c3c144bd09f5bc24f0f8f18e89a3b5520a69ee1bfc959665749b7d96e6"

RPROVIDES:${PN} += "f2c-devel \
f2c-devel(aarch-64)"
RDEPENDS:${PN} += "libf2c0"

inherit rpm
