SUMMARY = "Set P-State voltages and clock speeds on recent AMD CPUs on Linux"
DESCRIPTION = "Set P-State voltages and clock speeds on recent AMD CPUs on Linux."
LICENSE = "GPL-3.0-only"

PV = "0.11"

RPM_NAME = "amdctl-0.11-1.1.aarch64.rpm"
RPM_HASH = "3a286d6a37bc99da35fdccb044b00a0e53fd2cb1dfab78aee3ff3e9bec858a04d05dadecddb0ccce4459804ce1ed5c76aa647dbb19bafb04fb5131993d230f09"

RPROVIDES:${PN} += "amdctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
