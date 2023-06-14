SUMMARY = "RPM macros for systemd"
DESCRIPTION = "Starting with openSUSE 12.1, several RPM macros must be used to package systemd \
services files. This package provides these macros."
LICENSE = "LGPL-2.1-or-later"

PV = "22"

RPM_NAME = "systemd-rpm-macros-22-1.1.noarch.rpm"
RPM_HASH = "af7ac80f4c7b79977926f0350f34dd0613ba7f3f222652a3965bce3b676f8473a1d003cbf1ae3bce474f0b678b44c9c33d4e76b31f7f427f925859fe81a6255e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro--binfmtdir \
rpm-macro--environmentdir \
rpm-macro--journalcatalogdir \
rpm-macro--modprobedir \
rpm-macro--modulesloaddir \
rpm-macro--ntpunitsdir \
rpm-macro--presetdir \
rpm-macro--sysctldir \
rpm-macro--systemd-system-env-generator-dir \
rpm-macro--systemd-user-env-generator-dir \
rpm-macro--systemd-util-dir \
rpm-macro--systemdgeneratordir \
rpm-macro--systemdusergeneratordir \
rpm-macro--sysusersdir \
rpm-macro--tmpfilesdir \
rpm-macro--udevhwdbdir \
rpm-macro--udevrulesdir \
rpm-macro--unitdir \
rpm-macro--user-tmpfilesdir \
rpm-macro--userpresetdir \
rpm-macro--userunitdir \
rpm-macro-binfmt-apply \
rpm-macro-journal-catalog-update \
rpm-macro-service-add-post \
rpm-macro-service-add-pre \
rpm-macro-service-del-postun \
rpm-macro-service-del-postun-with-restart \
rpm-macro-service-del-postun-without-restart \
rpm-macro-service-del-preun \
rpm-macro-sysctl-apply \
rpm-macro-systemd-ordering \
rpm-macro-systemd-post \
rpm-macro-systemd-postun \
rpm-macro-systemd-postun-with-restart \
rpm-macro-systemd-pre \
rpm-macro-systemd-preun \
rpm-macro-systemd-requires \
rpm-macro-systemd-user-post \
rpm-macro-systemd-user-postun \
rpm-macro-systemd-user-postun-with-restart \
rpm-macro-systemd-user-pre \
rpm-macro-systemd-user-preun \
rpm-macro-sysusers-create \
rpm-macro-sysusers-create-inline \
rpm-macro-sysusers-create-package \
rpm-macro-tmpfiles-create \
rpm-macro-tmpfiles-create-package \
rpm-macro-udev-hwdb-update \
rpm-macro-udev-rules-update \
systemd-rpm-macros"

RDEPENDS:${PN} += "coreutils"

inherit rpm
