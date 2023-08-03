SUMMARY = "Empty package to ensure rebuilding delayacct-utils in OBS"
DESCRIPTION = "This is empty package that ensures delayacct-utils is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "delayacct-utils-rebuild-6.4.6-31.64.aarch64.rpm"
RPM_HASH = "e6dec721adecef4dbbac924346de0b8a9b822de74b94344b8576f39d9c964514432447382d16e28d4770a871310505db0bc0cb31143186d71274c45ef42a1d1a"

RPROVIDES:${PN} += "delayacct-utils-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
