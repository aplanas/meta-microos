SUMMARY = "Alternative status bar for i3"
DESCRIPTION = "i3blocks is a flexible status line for the i3 window manager. It handles \
clicks, signals and language-agnostic user scripts. \
 \
The content of each block (e.g. time, battery status, network state, ...) is \
the output of a command provided by the user. Blocks are updated on click, at a \
given interval of time or on a given signal, also specified by the user. \
 \
It follows the i3bar protocol, providing customization such as text \
alignment, urgency and color."
LICENSE = "GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "i3blocks-1.5-2.9.aarch64.rpm"
RPM_HASH = "4c632e5ddf48e3367d32cc46349b3b1bcc39b63a982df84a66c5c9979bb6e5e5583471c0405cbec7adf5238c614e571b0d6b6156fe7e1eaceaf4a7defd8c785b"

RPROVIDES:${PN} += "config-i3blocks \
i3blocks"

RDEPENDS:${PN} += "acpi \
alsa-utils \
i3 \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
xclip"

inherit rpm
