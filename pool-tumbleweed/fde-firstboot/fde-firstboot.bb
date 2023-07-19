SUMMARY = "Full Disk Encryption for images"
DESCRIPTION = "This package contains the scripts necessary to plug Full Disk Encryption \
into the JeOS Firstboot framework used for image based delivery of ALP."
LICENSE = "GPL-2.0-only"

PV = "0.6.5"

RPM_NAME = "fde-firstboot-0.6.5-3.1.aarch64.rpm"
RPM_HASH = "75f2e701e7bee3b8ce481f0f9191481aed13c88f0ad6877716346f9960512149118bbd84b124c3caa22e8f48299962dcae550546be4eaf9331d07045c44a8112"

RPROVIDES:${PN} += "fde-firstboot"

RDEPENDS:${PN} += "/usr/bin/bash \
fde-tools \
jeos-firstboot"

inherit rpm
