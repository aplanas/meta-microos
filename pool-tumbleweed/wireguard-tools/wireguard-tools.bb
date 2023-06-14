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

RPM_NAME = "wireguard-tools-1.0.20210914-6.3.aarch64.rpm"
RPM_HASH = "3826ac0209e6ffd4f5b374533f6095e8dc3958ef79d03e561bb6021742de92fb9557678160fb1bed1aa2331150b7afa6b19c98007f9de3728435b0e7c8fa1d10"

RPROVIDES:${PN} += "wireguard-tools"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
