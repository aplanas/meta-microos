SUMMARY = "KIWI - host requirements for WSL container images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build WSL container images"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "kiwi-systemdeps-containers-wsl-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "49e3a8d91fd6a1bd1ae5e344693c9dce0c0817c65b61aab911630b4e3331d6f0a5af03f53b794283ff53bccf4c1b4a5a6a6dda7836c6645e987e41462ef6e593"

RPROVIDES:${PN} += "kiwi-image-appx \
kiwi-image-wsl-requires \
kiwi-systemdeps-containers-wsl"

RDEPENDS:${PN} += "fb-util-for-appx"

inherit rpm
