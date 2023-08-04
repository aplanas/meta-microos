SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230727.0fd5122"

RPM_NAME = "rpmlint-mini-2.4.0+git20230727.0fd5122-12.4.aarch64.rpm"
RPM_HASH = "f67587840c45b30673af3b4a82fa199b2cec652886c786d0f4b9e3e9fb36f956f348113f64b0c48d81d07e43aba30e7f25f78c7964b7ac1dd3f3388dfdf6f17f"

RPROVIDES:${PN} += "rpmlint-mini"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
polkit-default-privs"

inherit rpm
