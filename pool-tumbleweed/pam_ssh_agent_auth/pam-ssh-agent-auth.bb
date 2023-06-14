SUMMARY = "Permits PAM authentication via your keyring in a forwarded ssh-agent"
DESCRIPTION = "pam_ssh_agent_auth is a PAM module which permits PAM \
authentication via your keyring in a forwarded ssh-agent. \
 \
20220111: using https://github.com/FlorianFranzen/pam_ssh_agent_auth, \
'just-one-big-cookie' branch so that ed25519 + Yubikey works."
LICENSE = "OpenSSL"

PV = "0.10.4"

RPM_NAME = "pam_ssh_agent_auth-0.10.4-2.8.aarch64.rpm"
RPM_HASH = "f06acfe386ceb7734f78ff4c79596eacee7fb5d8d33a7b4f99e628c09c5b88d958ee2cfe7d8bc481f51d12191fa8cd4555919817f5fde8632162d39e9d165f7f"

RPROVIDES:${PN} += "pam-ssh-agent-auth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpam.so.0"

inherit rpm
