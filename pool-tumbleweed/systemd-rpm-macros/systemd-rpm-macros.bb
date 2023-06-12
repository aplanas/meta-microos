SUMMARY = "RPM macros for systemd"
DESCRIPTION = "Starting with openSUSE 12.1, several RPM macros must be used to package systemd \
services files. This package provides these macros."
LICENSE = "LGPL-2.1-or-later"

PV = "22"

RPM_NAME = "systemd-rpm-macros-22-1.1.noarch.rpm"
RPM_HASH = "af7ac80f4c7b79977926f0350f34dd0613ba7f3f222652a3965bce3b676f8473a1d003cbf1ae3bce474f0b678b44c9c33d4e76b31f7f427f925859fe81a6255e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm_macro(_binfmtdir) \
rpm_macro(_environmentdir) \
rpm_macro(_journalcatalogdir) \
rpm_macro(_modprobedir) \
rpm_macro(_modulesloaddir) \
rpm_macro(_ntpunitsdir) \
rpm_macro(_presetdir) \
rpm_macro(_sysctldir) \
rpm_macro(_systemd_system_env_generator_dir) \
rpm_macro(_systemd_user_env_generator_dir) \
rpm_macro(_systemd_util_dir) \
rpm_macro(_systemdgeneratordir) \
rpm_macro(_systemdusergeneratordir) \
rpm_macro(_sysusersdir) \
rpm_macro(_tmpfilesdir) \
rpm_macro(_udevhwdbdir) \
rpm_macro(_udevrulesdir) \
rpm_macro(_unitdir) \
rpm_macro(_user_tmpfilesdir) \
rpm_macro(_userpresetdir) \
rpm_macro(_userunitdir) \
rpm_macro(binfmt_apply) \
rpm_macro(journal_catalog_update) \
rpm_macro(service_add_post) \
rpm_macro(service_add_pre) \
rpm_macro(service_del_postun) \
rpm_macro(service_del_postun_with_restart) \
rpm_macro(service_del_postun_without_restart) \
rpm_macro(service_del_preun) \
rpm_macro(sysctl_apply) \
rpm_macro(systemd_ordering) \
rpm_macro(systemd_post) \
rpm_macro(systemd_postun) \
rpm_macro(systemd_postun_with_restart) \
rpm_macro(systemd_pre) \
rpm_macro(systemd_preun) \
rpm_macro(systemd_requires) \
rpm_macro(systemd_user_post) \
rpm_macro(systemd_user_postun) \
rpm_macro(systemd_user_postun_with_restart) \
rpm_macro(systemd_user_pre) \
rpm_macro(systemd_user_preun) \
rpm_macro(sysusers_create) \
rpm_macro(sysusers_create_inline) \
rpm_macro(sysusers_create_package) \
rpm_macro(tmpfiles_create) \
rpm_macro(tmpfiles_create_package) \
rpm_macro(udev_hwdb_update) \
rpm_macro(udev_rules_update) \
systemd-rpm-macros"
RDEPENDS:${PN} += "coreutils"

inherit rpm
