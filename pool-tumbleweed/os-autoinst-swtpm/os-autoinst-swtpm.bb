SUMMARY = "Convenience package providing os-autoinst+swtpm"
DESCRIPTION = "Convenience package providing os-autoinst and swtpm dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690540437.6c17e24"

RPM_NAME = "os-autoinst-swtpm-4.6.1690540437.6c17e24-1.1.aarch64.rpm"
RPM_HASH = "a6f77fdf35972773a39542b2aa8bda86e2485d5ec98d8dcb47f52c76629ef8cee85780e18cd134a74776ac599dbd3efeaba54617bf1b868c77eb401d5709f250"

RPROVIDES:${PN} += "os-autoinst-swtpm"

RDEPENDS:${PN} += "os-autoinst \
swtpm"

inherit rpm
