SUMMARY = "Header files for the BPF Compiler Collection"
DESCRIPTION = "Headers and pkg-config build descriptions for developing BCC programs."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-devel-0.26.0-2.11.aarch64.rpm"
RPM_HASH = "68f8020a8dbc31332d6d6a75eb9f53c5960123438fc00457b763931e514ee950420ccfcd41ca8800f912d71d641cba6b0fb4ea5b510ebf183961b98996b3f06c"

RPROVIDES:${PN} += "bcc-devel \
pkgconfig-libbcc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbcc0"

inherit rpm
