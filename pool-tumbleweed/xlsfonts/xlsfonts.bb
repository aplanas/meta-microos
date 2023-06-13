SUMMARY = "Utility to list fonts available from an X server"
DESCRIPTION = "xlsfonts lists fonts available from an X server via the X11 core \
protocol."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "xlsfonts-1.0.7-1.6.aarch64.rpm"
RPM_HASH = "759abb1cf3a440dce268da0b51aed14858eb55aee2c80397c8b6b5c81cd546eb57e7a6f7ade243e8f7f43d292f7a4532a58f8a277f11ab6512c4b6591e99b666"

RPROVIDES:${PN} += "xlsfonts \
xlsfonts(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
