SUMMARY = "RPM macros for systemd"
DESCRIPTION = "Starting with openSUSE 12.1, several RPM macros must be used to package systemd \
services files. This package provides these macros."
LICENSE = "LGPL-2.1-or-later"

PV = "24"

RPM_NAME = "systemd-rpm-macros-24-1.1.noarch.rpm"
RPM_HASH = "ed7bc70b1bd5bd7ffeb9f1c7cca42b3a2fb491644ae10f2153b36e3b159502696f64fb2a9abc02af980d88475f66896abcd9096bc6b8788e4d565f28d3da5b02"
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
rpm-macro-sysusers-create-package \
rpm-macro-tmpfiles-create \
rpm-macro-udev-hwdb-update \
rpm-macro-udev-rules-update \
systemd-rpm-macros"

RDEPENDS:${PN} += "coreutils"

inherit rpm
