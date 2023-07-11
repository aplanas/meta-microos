SUMMARY = "Development files for Guile-SSH"
DESCRIPTION = "The libraries and header files for developing applications that use guile-ssh."
LICENSE = "GPL-3.0-or-later"

PV = "0.16.3"

RPM_NAME = "guile-ssh-devel-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "961f0279aa7333c392e67681509b71877f19bd3003af372505376c953ec1bbb72709647b69222eabc97fdbbfa1a47c5144b12941e9d3ecf84ee3a602d8d39c02"

RPROVIDES:${PN} += "guile-ssh-devel"

RDEPENDS:${PN} += "/usr/bin/guile \
/usr/bin/sh \
libguile-ssh14"

inherit rpm
