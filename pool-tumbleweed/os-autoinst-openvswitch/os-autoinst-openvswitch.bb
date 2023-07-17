SUMMARY = "Openvswitch support for os-autoinst"
DESCRIPTION = "This package contains openvswitch support for os-autoinst."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688832263.576c710"

RPM_NAME = "os-autoinst-openvswitch-4.6.1688832263.576c710-1.1.aarch64.rpm"
RPM_HASH = "acd5b4da9f02d2a488f38b8f0d145b0bbb96ad6611f8177bc5f58cff290b48cde3f388225a1414e0fc57023dd8b9a5d45e7c9a45f829a15a7a09c5b239aa07a4"

RPROVIDES:${PN} += "config-os-autoinst-openvswitch \
os-autoinst-openvswitch"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
openvswitch \
openvswitch-switch \
os-autoinst"

inherit rpm
