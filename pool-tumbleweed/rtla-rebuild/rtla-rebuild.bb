SUMMARY = "Empty package to ensure rebuilding rtla in OBS"
DESCRIPTION = "This is an empty package that ensures rtla is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "rtla-rebuild-6.4.3-5.8.aarch64.rpm"
RPM_HASH = "29b24a101d2a6c694c14325626485c877cf97ba20886ce8032b5cd3658ebe0a9637bfdf9446cd0d8c03b0fa9ab7321a56efb24c14b977859905d07bd3ca55ba3"

RPROVIDES:${PN} += "rtla-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
