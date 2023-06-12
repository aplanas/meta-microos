SUMMARY = "SELinux policy configuration"
DESCRIPTION = "SELinux Reference Policy. A complete SELinux policy that can be used \
as the system policy for a variety of systems and used as the basis for \
creating other policies."
LICENSE = "GPL-2.0-or-later"

PV = "20230425"

RPM_NAME = "selinux-policy-20230425-1.1.noarch.rpm"
RPM_HASH = "69e8da0e1c79f2c02032912c808f4f9e09451614e2f7e467564fd515782819884d7d752a74bc4d2bf8438722b9a1c25edc5704291efed5e5f9454e3babe4fe3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(selinux-policy) \
rpm_macro(_file_context_file) \
rpm_macro(_file_context_file_pre) \
rpm_macro(_file_custom_defined_booleans) \
rpm_macro(_file_custom_defined_booleans_tmp) \
rpm_macro(_selinux_policy_version) \
rpm_macro(_selinux_store_path) \
rpm_macro(_selinux_store_policy_path) \
rpm_macro(selinux_modules_install) \
rpm_macro(selinux_modules_uninstall) \
rpm_macro(selinux_relabel_post) \
rpm_macro(selinux_relabel_pre) \
rpm_macro(selinux_requires) \
rpm_macro(selinux_set_booleans) \
rpm_macro(selinux_unset_booleans) \
selinux-policy"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/sha512sum \
pam-config \
policycoreutils \
selinux-tools"

inherit rpm
