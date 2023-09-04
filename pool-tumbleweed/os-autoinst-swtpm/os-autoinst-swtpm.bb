SUMMARY = "Convenience package providing os-autoinst+swtpm"
DESCRIPTION = "Convenience package providing os-autoinst and swtpm dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692873408.b5fd97a"

RPM_NAME = "os-autoinst-swtpm-4.6.1692873408.b5fd97a-1.1.aarch64.rpm"
RPM_HASH = "d271f0689010ab2004559cbd6c2b3137f92d257fe005e3c24d632a3f42e18fe02ebbc19b0e7bf4f7a55cb81b3f6f8c6af8a41a66c1591543cf1a24622428fd3c"

RPROVIDES:${PN} += "os-autoinst-swtpm"

RDEPENDS:${PN} += "os-autoinst \
swtpm"

inherit rpm
