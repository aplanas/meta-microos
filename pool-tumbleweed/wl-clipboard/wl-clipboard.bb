SUMMARY = "Wayland Clipboard Utilities"
DESCRIPTION = "This project implements two command-line Wayland clipboard utilities, wl-copy and wl-paste, that let you easily copy data between the clipboard and Unix pipes, sockets, files and so on."
LICENSE = "GPL-3.0-only"

PV = "2.2.0"

RPM_NAME = "wl-clipboard-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "6180900455aebe9825f1db8dd7daae622ba853b0065a6bf50a9dbefd2788547d43cc3e6b2dc72fe75a9c3d8da72c65ec1b595afa53716989a2cd566407f38f9f"

RPROVIDES:${PN} += "wl-clipboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0"

inherit rpm
