SUMMARY = "WireGuard userspace tools"
DESCRIPTION = "WireGuard is a novel VPN that runs inside the Linux Kernel and uses \
state-of-the-art cryptography (the 'Noise' protocol). It aims to be \
faster, simpler, leaner, and more useful than IPSec, while avoiding \
the massive headache. It intends to be considerably more performant \
than OpenVPN. WireGuard is designed as a general purpose VPN for \
running on embedded interfaces and super computers alike, fit for \
many different circumstances. It runs over UDP. \
 \
This package contains command-line tools to interact with the \
WireGuard kernel module.  Currently, it provides only a single tool: \
 \
wg: set and retrieve configuration of WireGuard interfaces"
LICENSE = "GPL-2.0-only"

PV = "1.0.20210914"

RPM_NAME = "wireguard-tools-1.0.20210914-6.4.aarch64.rpm"
RPM_HASH = "04b852332cb5501da9e58b548f0a05d7ecc66e938ba04640698b7e8578e406a33e81f63d9a1797d5488d59c32c819d538a1a815f91187b6cc32c82faa7ff38df"

RPROVIDES:${PN} += "wireguard-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
