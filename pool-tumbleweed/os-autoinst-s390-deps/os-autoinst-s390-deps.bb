SUMMARY = "Convenience package providing os-autoinst + s390 worker jumphost deps"
DESCRIPTION = "Convenience package providing os-autoinst + s390 worker jumphost dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688579291.d13a461"

RPM_NAME = "os-autoinst-s390-deps-4.6.1688579291.d13a461-1.1.aarch64.rpm"
RPM_HASH = "e4fdc883cd9f62985b433242aff6943f1bd52be966882822a8f7d62731030eb683300cb718eb3b91506bd425569746a8bafb23333a711cee33d4d3cd2f5d9224"

RPROVIDES:${PN} += "os-autoinst-s390-deps"

RDEPENDS:${PN} += "/usr/bin/Xvnc \
/usr/bin/xkbcomp \
fonts-config \
icewm \
mkfontdir \
mkfontscale \
os-autoinst \
x3270 \
xdotool \
xterm \
xterm-console"

inherit rpm
