SUMMARY = "Common server files or settings for kanku"
DESCRIPTION = "This package contains common server files, settings and dependencies \
for the kanku server components like kanku-worker, kanku-dispatcher, \
kanku-web, kanku-scheduler and kanku-triggerd."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-common-server-0.14.0-1.5.noarch.rpm"
RPM_HASH = "aba856e1fc628a147185306fe2c17cf0a05d372af41dac45732f9a7ba64755a432579cf62a200d36a7d171a376b8371a35c4ff00a86f0e2f85db669b5c80ac62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-common-server"

RDEPENDS:${PN} += "/usr/bin/sh \
libvirt-daemon \
libvirt-daemon-driver-qemu \
shadow"

inherit rpm
