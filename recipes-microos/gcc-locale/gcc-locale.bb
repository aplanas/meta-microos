SUMMARY = "The system GNU Compiler locale files"
DESCRIPTION = "The system GNU Compiler locale files."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-locale-13-1.3.aarch64.rpm"
RPM_HASH = "4d45772021e293ffcbd06fc895379df7dc180602897543b214ada520a82f081694c1f5bf5bb5d721e5a37cfaeb4978e3a26721b33283e60b84f2e71ac245bbac"

RPROVIDES:${PN} += "gcc-locale gcc-locale(aarch-64)"
RDEPENDS:${PN} += "gcc13-locale"

inherit rpm
