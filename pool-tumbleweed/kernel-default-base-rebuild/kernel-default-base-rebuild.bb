SUMMARY = "Empty package to ensure rebuilding kernel-default-base in OBS"
DESCRIPTION = "This is empty package that ensures kernel-default-base is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-default-base-rebuild-6.3.4-1.1.27.5.aarch64.rpm"
RPM_HASH = "a828ecf7991ad0daf1746c0392630815e951961adcc0d84e8379c77a3e888056dc29f9b975d984045280c571336ad49bfe7b71c422cf2a19cf5f2dafaa278911"

RPROVIDES:${PN} += "kernel-default-base-rebuild \
kernel-default-base-rebuild(aarch-64)"

RDEPENDS:${PN} += "kernel-default"

inherit rpm
