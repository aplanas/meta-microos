SUMMARY = "Convenience package providing os-autoinst + s390 worker jumphost deps"
DESCRIPTION = "Convenience package providing os-autoinst + s390 worker jumphost dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692873408.b5fd97a"

RPM_NAME = "os-autoinst-s390-deps-4.6.1692873408.b5fd97a-1.1.aarch64.rpm"
RPM_HASH = "ff681771df5ce48cb39b278517847398e55ee4f92533f6884d9b48e1860c352f40ea5c8e9f9d767124c21efe4c7bffc24739ce57cb8ff069e88dedd10b1fcb6c"

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
