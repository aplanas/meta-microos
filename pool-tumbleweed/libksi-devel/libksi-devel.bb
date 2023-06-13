SUMMARY = "Development files for the libksi package"
DESCRIPTION = "LibKSI - Keyless Signature Infrastructure GuardTime client library \
The libksi-devel package contains the header files and libraries \
needed to develop applications using libksi."
LICENSE = "Apache-2.0"

PV = "3.4.0.5"

RPM_NAME = "libksi-devel-3.4.0.5-3.24.aarch64.rpm"
RPM_HASH = "9b805588626690bdc41ec85bce1bea6e960cd6a725d373e689d53241504028f93e35509773c1f845ba7b0378fed640f89335a57ba4b8c323f9549e35c38c4161"

RPROVIDES:${PN} += "libksi-devel \
libksi-devel(aarch-64) \
pkgconfig(libksi)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libksi1"

inherit rpm
