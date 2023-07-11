SUMMARY = "Permits PAM authentication via your keyring in a forwarded ssh-agent"
DESCRIPTION = "pam_ssh_agent_auth is a PAM module which permits PAM \
authentication via your keyring in a forwarded ssh-agent. \
 \
20220111: using https://github.com/FlorianFranzen/pam_ssh_agent_auth, \
'just-one-big-cookie' branch so that ed25519 + Yubikey works."
LICENSE = "OpenSSL"

PV = "0.10.4"

RPM_NAME = "pam_ssh_agent_auth-0.10.4-2.9.aarch64.rpm"
RPM_HASH = "c9f7bdb4a888a3615835315aac976737cd64f649675b3fece7f41f1ba3ce243d0495d72b1170f04a5603beee8071dab45af3c799b59f5ce8cca2a78401e01735"

RPROVIDES:${PN} += "pam-ssh-agent-auth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpam.so.0"

inherit rpm
