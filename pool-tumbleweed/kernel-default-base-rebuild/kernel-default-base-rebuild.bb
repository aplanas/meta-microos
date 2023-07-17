SUMMARY = "Empty package to ensure rebuilding kernel-default-base in OBS"
DESCRIPTION = "This is empty package that ensures kernel-default-base is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-default-base-rebuild-6.4.2-1.1.28.2.aarch64.rpm"
RPM_HASH = "01848a0ec4001286c415fe172f74e603872443e6a593e03d80cc5c5def33d07eda66de692b164d13cf78e6c463b3b23b53e6a856921a945befae4f49cf714478"

RPROVIDES:${PN} += "kernel-default-base-rebuild"

RDEPENDS:${PN} += "kernel-default"

inherit rpm
