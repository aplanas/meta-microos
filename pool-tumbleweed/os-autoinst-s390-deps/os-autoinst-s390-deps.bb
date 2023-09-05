SUMMARY = "Convenience package providing os-autoinst + s390 worker jumphost deps"
DESCRIPTION = "Convenience package providing os-autoinst + s390 worker jumphost dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693332527.fb060dc"

RPM_NAME = "os-autoinst-s390-deps-4.6.1693332527.fb060dc-1.1.aarch64.rpm"
RPM_HASH = "62cb2b7930f095d32a1d0a706c04edc35c7fb2c7c139fab257003652d3135bb92e29f649a4eba9a2bfb64a34a65a34ec0bf48c6c2f32eacb1756df1e2940bcc1"

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
