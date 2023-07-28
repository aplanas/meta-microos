SUMMARY = "Virtio vga device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio vga device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-display-virtio-vga-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "3ebff57e6629c8863bf53d6d1e4941e05b61bf21c8f423082deed4fc18c194b24878c4fcecf4cd6ee470f4e8832136d95a8a3cb0fbcb2082484dda8ba2acbae2"

RPROVIDES:${PN} += "qemu-hw-display-virtio-vga"

RDEPENDS:${PN} += ""

inherit rpm
