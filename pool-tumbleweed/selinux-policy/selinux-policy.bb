SUMMARY = "SELinux policy configuration"
DESCRIPTION = "SELinux Reference Policy. A complete SELinux policy that can be used \
as the system policy for a variety of systems and used as the basis for \
creating other policies."
LICENSE = "GPL-2.0-or-later"

PV = "20230622"

RPM_NAME = "selinux-policy-20230622-1.1.noarch.rpm"
RPM_HASH = "7c915bb4071db259316ba544017081a2bc74511dd36d001621e3d7af48f44a96ea2f9926ca155914c9210009f9268023e3d0c94e00c439b16d28c3fd73ec6c68"
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
