SUMMARY = "Amlogic based arm64 systems"
DESCRIPTION = "Device Tree files for Amlogic based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-amlogic-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "a5ffc8e0da22ac848e28996503eb8f156ec9681a83d67e208ac2fb98fd81bcb8411692bd1e3f45e5cda3b115276863b713b525e0a85795099e59789980cbd362"

RPROVIDES:${PN} += "dtb-amlogic \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
