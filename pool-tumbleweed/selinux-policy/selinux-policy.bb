SUMMARY = "SELinux policy configuration"
DESCRIPTION = "SELinux Reference Policy. A complete SELinux policy that can be used \
as the system policy for a variety of systems and used as the basis for \
creating other policies."
LICENSE = "GPL-2.0-or-later"

PV = "20230425"

RPM_NAME = "selinux-policy-20230425-1.1.noarch.rpm"
RPM_HASH = "69e8da0e1c79f2c02032912c808f4f9e09451614e2f7e467564fd515782819884d7d752a74bc4d2bf8438722b9a1c25edc5704291efed5e5f9454e3babe4fe3c"
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

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/sha512sum \
pam-config \
policycoreutils \
selinux-tools"

inherit rpm
