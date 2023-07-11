SUMMARY = "Development files for the libksi package"
DESCRIPTION = "LibKSI - Keyless Signature Infrastructure GuardTime client library \
The libksi-devel package contains the header files and libraries \
needed to develop applications using libksi."
LICENSE = "Apache-2.0"

PV = "3.4.0.5"

RPM_NAME = "libksi-devel-3.4.0.5-3.25.aarch64.rpm"
RPM_HASH = "69d611df471e8b364235ddb6cb143ccd3f278853ad0418f622e4d25717749355c08b78f052a7da59e30187c86b16cd2fac5005eaca0106f337c5cb53651fe5e9"

RPROVIDES:${PN} += "libksi-devel \
pkgconfig-libksi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libksi1"

inherit rpm
