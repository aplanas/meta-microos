SUMMARY = "Configuration file for Cloud node initialization tool"
DESCRIPTION = "This package contains the product specific configuration file \
for cloud-init."
LICENSE = "GPL-3.0"

PV = "23.1"

RPM_NAME = "cloud-init-config-suse-23.1-1.3.aarch64.rpm"
RPM_HASH = "ce473195eb7aa2cadfcc5f34d962935c4860236ff265767384b8f003a7a7a56495c826e6db900e66875bb2921c70e99f78a8e4f19d5f9d8acb60c49169b8136f"

RPROVIDES:${PN} += "cloud-init-config \
cloud-init-config-suse \
cloud-init-config-suse(aarch-64) \
config(cloud-init-config-suse)"
RDEPENDS:${PN} += ""

inherit rpm
