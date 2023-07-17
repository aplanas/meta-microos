SUMMARY = "Qualcomm based arm64 systems"
DESCRIPTION = "Device Tree files for Qualcomm based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-qcom-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "db38e2bbebad2a1336b31edf7675b17649e82bb0e62ccf8da09314fd2ec7ca2a2ef9b619642f5197215236ecfdcb18da724fe8d3724a824e1b2e84f53406e45f"

RPROVIDES:${PN} += "dtb-qcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
