SUMMARY = "KIWI - host requirements for WSL container images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build WSL container images"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-containers-wsl-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "11bc0ada4047bc3242189e4db2462598682cd094ac427d805378e7401a0764be0c61b50b6738752bd58720a63c88ece55fc15d75de5570f32dd46892d7efb8bb"

RPROVIDES:${PN} += "kiwi-image-appx \
kiwi-image-wsl-requires \
kiwi-systemdeps-containers-wsl"

RDEPENDS:${PN} += "fb-util-for-appx"

inherit rpm
