SUMMARY = "Convenience package providing os-autoinst+swtpm"
DESCRIPTION = "Convenience package providing os-autoinst and swtpm dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683886197.05274f7"

RPM_NAME = "os-autoinst-swtpm-4.6.1683886197.05274f7-1.1.aarch64.rpm"
RPM_HASH = "479d5b9fde9c50737801e96f8d94aa9e0ab25084243ff8cab84ea9f7b8fd1dae5e395bcf4d23ffd3dea410f71def24d71e8f473244835c8d3af7e9dc89896437"

RPROVIDES:${PN} += "os-autoinst-swtpm \
os-autoinst-swtpm(aarch-64)"

RDEPENDS:${PN} += "os-autoinst \
swtpm"

inherit rpm
