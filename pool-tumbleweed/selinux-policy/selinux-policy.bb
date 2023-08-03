SUMMARY = "SELinux policy configuration"
DESCRIPTION = "SELinux Reference Policy. A complete SELinux policy that can be used \
as the system policy for a variety of systems and used as the basis for \
creating other policies."
LICENSE = "GPL-2.0-or-later"

PV = "20230728"

RPM_NAME = "selinux-policy-20230728-1.1.noarch.rpm"
RPM_HASH = "db3c3ae54f40b744fd13248371eb6f677216d179964219a39085977d6a4d1fada7dbc6d8bb0d7d0b297798abec1e50fc4d6bade462e39f2decb85a978e5991bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-selinux-policy \
rpm-macro--file-context-file \
rpm-macro--file-context-file-pre \
rpm-macro--file-custom-defined-booleans \
rpm-macro--file-custom-defined-booleans-tmp \
rpm-macro--selinux-policy-version \
rpm-macro--selinux-store-path \
rpm-macro--selinux-store-policy-path \
rpm-macro-selinux-modules-install \
rpm-macro-selinux-modules-uninstall \
rpm-macro-selinux-relabel-post \
rpm-macro-selinux-relabel-pre \
rpm-macro-selinux-requires \
rpm-macro-selinux-set-booleans \
rpm-macro-selinux-unset-booleans \
selinux-policy"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/sha512sum \
pam-config \
policycoreutils \
selinux-tools"

inherit rpm
