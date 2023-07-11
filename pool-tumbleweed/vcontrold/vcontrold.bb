SUMMARY = "Daemon for communication with Viessmann heating controllers"
DESCRIPTION = "vcontrold is a software daemon written in C for communication with \
the 'Optolink' interface of Viessmann heating controllers."
LICENSE = "GPL-3.0-or-later"

PV = "v0.98.10+git20210418.977e6f5"

RPM_NAME = "vcontrold-v0.98.10+git20210418.977e6f5-1.10.aarch64.rpm"
RPM_HASH = "d91ced356bea2cc75a958c524ee01d55596c53819d701d9ec0be08608e89a00601aec0b2f3bf716320fecb87d333f15fbaea206aaec590cbdf80ccfecc32e35a"

RPROVIDES:${PN} += "config-vcontrold \
group-vcontrold \
user-vcontrold \
vcontrold"

RDEPENDS:${PN} += "/usr/bin/sh \
group-dialout \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
sysuser-shadow"

inherit rpm
