SUMMARY = "Scalable IRCv3.2 compliant chat daemon"
DESCRIPTION = "Solanum is an IRCv3.2 compatible chat server. It is a continuation of the \
Charybdis server and has good documentation and ease of configuration. \
 \
Charybdis was used on various networks either as itself, or as \
the basis of a customized IRC server implementation. One such \
customization is ircd-seven which powers Freenode, the largest IRC \
network in the world."
LICENSE = "GPL-2.0-or-later"

PV = "0~ch560"

RPM_NAME = "solanum-0~ch560-2.10.aarch64.rpm"
RPM_HASH = "00dcecd9e8edfe687f591305d81f3b022a07d9930e53c0320d8e4ceb4ed10a38427e8279e8bbcf65df939616da70d410d3f712406dd0389817baf11f60ffe351"

RPROVIDES:${PN} += "config(solanum) \
libircd.so()(64bit) \
librb.so()(64bit) \
solanum \
solanum(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libltdl.so.7()(64bit) \
libsqlite3.so.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
shadow"

inherit rpm
