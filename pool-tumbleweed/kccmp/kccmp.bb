SUMMARY = "Tool for kernel configurations comparison"
DESCRIPTION = "kccmp is a simple tool for comparing two linux kernel '.config' files."
LICENSE = "GPL-2.0-only"

PV = "v1.0.0"

RPM_NAME = "kccmp-v1.0.0-1.1.aarch64.rpm"
RPM_HASH = "777d498a35d223984b5212a4c5ffa0836dd736cd722e763b4f458d48e89bdde5a9ef611e12aba97b0712b2abac4426e2f0197befeb66468383235d19164def33"

RPROVIDES:${PN} += "kccmp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
