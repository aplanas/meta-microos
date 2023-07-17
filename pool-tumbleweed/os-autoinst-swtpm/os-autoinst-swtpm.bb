SUMMARY = "Convenience package providing os-autoinst+swtpm"
DESCRIPTION = "Convenience package providing os-autoinst and swtpm dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688832263.576c710"

RPM_NAME = "os-autoinst-swtpm-4.6.1688832263.576c710-1.1.aarch64.rpm"
RPM_HASH = "fa9823691a63d020f2bba3e30741ea9f6f1d9ccda412e2f3378e83a9aaf8125c59c402a99b46a4247db63314c825b1fec04b65ccc3605d54b7a38d6bf02ef1b7"

RPROVIDES:${PN} += "os-autoinst-swtpm"

RDEPENDS:${PN} += "os-autoinst \
swtpm"

inherit rpm
