SUMMARY = "SUSE specific RPM configuration files"
DESCRIPTION = "This package contains the RPM configuration data for the SUSE and \
openSUSE distribution families."
LICENSE = "GPL-2.0-or-later"

PV = "20220926"

RPM_NAME = "rpm-config-SUSE-20220926-1.3.noarch.rpm"
RPM_HASH = "0048b4f385ef887fc5b04fc1515f91e5c50945c12368084605487951b4de65b101a40574d857e8e6fb7dc056751cdbda459386a9981621174a2e166e3a73e745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-config-SUSE \
rpm_macro(_binarychangelogtrim) \
rpm_macro(_vpath_builddir) \
rpm_macro(_vpath_srcdir) \
rpm_macro(ext_info) \
rpm_macro(ext_man) \
rpm_macro(ldconfig) \
rpm_macro(ldconfig_post) \
rpm_macro(ldconfig_postun) \
rpm_macro(ldconfig_scriptlets) \
rpm_macro(regenerate_initrd_post) \
rpm_macro(regenerate_initrd_posttrans) \
rpm_macro(sbat_distro) \
rpm_macro(sbat_distro_summary) \
rpm_macro(sbat_distro_url) \
rpm_macro(user_group_add)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
rpm"

inherit rpm
