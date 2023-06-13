SUMMARY = "Data files for libsigrok"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libsigrok-data-0.5.2-4.12.noarch.rpm"
RPM_HASH = "5cb1989b68bce824f1ad1a49263eb34c080dd8d4597e2c2907f0b87f819b0a2272aa3643ed56bc8ada9755cf65894a3c2d1cd7905bde66b3270694ab532f78af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsigrok-data"

RDEPENDS:${PN} += "hicolor-icon-theme \
shared-mime-info"

inherit rpm
