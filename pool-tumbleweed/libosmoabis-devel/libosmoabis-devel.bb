SUMMARY = "Development files for the Osmocom GSM A-bis library"
DESCRIPTION = "This library contains common/shared code regarding the GSM A-bis \
interface. It also implements drivers for mISDN and DAHDI-based E1 \
cards, as well as some A-bis/IP dialects. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmoabis."
LICENSE = "AGPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "libosmoabis-devel-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "44c989f32bbad610c90def5aaff1cc8f88b0c4e46557a517f0810e1dd1f6e5b9136afda55b6bc0b993b51030e9b53bcae1a1a6cda60630b87036b2507110d5b3"

RPROVIDES:${PN} += "libosmoabis-devel \
libosmoabis-devel(aarch-64) \
pkgconfig(libosmoabis)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmoabis10 \
libosmocore-devel \
libosmogsm-devel \
pkgconfig(libosmocore)"

inherit rpm
