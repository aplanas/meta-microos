SUMMARY = "Linux-PAM Module that Allows a User to Be Chrooted"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
pam_chroot is a Linux-PAM module that allows a user to be chrooted in \
auth, account, or session. \
 \
 \
 \
Authors: \
-------- \
    Matthew Kirkwood (weejock@ferret.lmh.ox.ac.uk) \
    Ed Schmollinger (schmolli@frozencrow.org)"
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "pam_chroot-0.9.2-64.7.aarch64.rpm"
RPM_HASH = "0a5dc6bdae1c693d7315800915a91af4de37a7f5348f8d041413b73661ea94e1927ac770fcc7a770155bc519d9710baf205368c28761341ca3758826d8ec7904"

RPROVIDES:${PN} += "config(pam_chroot) \
pam-modules:/etc/security/chroot.conf \
pam_chroot \
pam_chroot(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpam.so.0()(64bit) \
pam"

inherit rpm
