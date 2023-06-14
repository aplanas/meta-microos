SUMMARY = "Tool to create and manage DPAA2"
DESCRIPTION = "restool is a user space application providing the ability to dynamically create and manage DPAA2 containers and objects from Linux."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.1"

RPM_NAME = "restool-2.3.1-2.7.aarch64.rpm"
RPM_HASH = "dcac246d0812f208f02728bd0129e25b638ae0f1280c367989c7eb8b1d1f757c56a7a03613f5ddb9d819c100af6c5f8b058ed3a9486f245edae8bcc992a3d37d"

RPROVIDES:${PN} += "restool"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
libc.so.6 \
libm.so.6"

inherit rpm
