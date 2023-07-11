SUMMARY = "PAM module to manage NTLM credentials in kernel keyring"
DESCRIPTION = "The pam_cifscreds PAM module is a tool for automatically adding \
credentials (username and password) for the purpose of establishing \
sessions in multiuser mounts. \
 \
When a cifs filesystem is mounted with the 'multiuser' option, and does \
not use krb5 authentication, it needs to be able to get the credentials \
for each user from somewhere. The pam_cifscreds module can be used to \
provide these credentials to the kernel automatically at login."
LICENSE = "GPL-3.0-or-later"

PV = "7.0"

RPM_NAME = "pam_cifscreds-7.0-2.4.aarch64.rpm"
RPM_HASH = "df1a47a0a6e8ff6191695a711a36012e595bc5985a29b2032be3504dcddee8d92a94c583bdd6bf321e923e15fc9c8135e9fa405d33fdc00c72e3fc1923ab75c7"

RPROVIDES:${PN} += "pam-cifscreds"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
libpam.so.0"

inherit rpm
