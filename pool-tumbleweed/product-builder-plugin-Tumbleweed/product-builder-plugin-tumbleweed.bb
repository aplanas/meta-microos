SUMMARY = "openSUSE - KIWI Image System"
DESCRIPTION = "openSUSE - Product Builder Image System InstSource plugins provides information \
and plugin code to create meta information for a SUSE \
installation source. This particular package contains the metadata \
plugins specific for the openSUSE Tumblweed media."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.3"

RPM_NAME = "product-builder-plugin-Tumbleweed-1.8.3-1.1.noarch.rpm"
RPM_HASH = "3c7f17f2fa40f1292ee503bcc355d7011e0495f3f436b061564af241d08e9d62a8bcc0dcec81a5d334b1379b5efb81daf245240d6dda6542cb6f3715e38235cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(product-builder-plugin-Tumbleweed) \
perl(KIWIBasePlugin) \
perl(KIWIBootIsoPlugin) \
perl(KIWIChecksumPlugin) \
perl(KIWIDescrPlugin) \
perl(KIWIDnfRepoclosurePlugin) \
perl(KIWIEulaPlugin) \
perl(KIWIInstallCheckPlugin) \
perl(KIWIMiniIsoPlugin) \
perl(KIWIPackagesDVDPlugin) \
product-builder-plugin \
product-builder-plugin-Tumbleweed"
RDEPENDS:${PN} += "build \
createrepo_c \
dnf \
instsource-susedata \
mkdosfs \
mtools \
openSUSE-appstream-process \
package-EULAs \
package-translations \
perl(YAML::XS) \
product-builder"

inherit rpm
