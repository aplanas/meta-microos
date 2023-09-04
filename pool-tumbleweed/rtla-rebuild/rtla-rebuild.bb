SUMMARY = "Empty package to ensure rebuilding rtla in OBS"
DESCRIPTION = "This is an empty package that ensures rtla is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "rtla-rebuild-6.4.11-5.13.aarch64.rpm"
RPM_HASH = "47a0735aa8fa955581c4b74e30b94895ef867768e4ca29e58f10cbd93bbb227403eb97d0f1b4fa7eb6ca8c79d10a20ad4fbc7d6a5d33efb6621e5e218edd5090"

RPROVIDES:${PN} += "rtla-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
