SUMMARY = "Empty package to ensure rebuilding kernel-default-base in OBS"
DESCRIPTION = "This is empty package that ensures kernel-default-base is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-default-base-rebuild-6.4.6-1.1.28.5.aarch64.rpm"
RPM_HASH = "1bbe7a3f1bebb8fee643a116162b3b71b48c3919a70d7c86ee4a8f58e285f7d11bc1c97f7fd844baaad80258826f4a3b09da1484e903cb9697d195f5f05afae2"

RPROVIDES:${PN} += "kernel-default-base-rebuild"

RDEPENDS:${PN} += "kernel-default"

inherit rpm
