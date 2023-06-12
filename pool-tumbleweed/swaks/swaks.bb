SUMMARY = "Swiss Army Knife for SMTP"
DESCRIPTION = "Swaks is a scriptable, transaction-oriented SMTP test \
tool. Features include: \
 \
* SMTP extensions including TLS, authentication, pipelining, and \
  XCLIENT \
* Protocols including SMTP, ESMTP, and LMTP \
* Transports including UNIX-domain sockets, internet-domain sockets \
  (IPv4 and IPv6), and pipes to spawned processes \
* Completely scriptable configuration, with option specification via \
  environment variables, configuration files, and command line"
LICENSE = "GPL-2.0-only"

PV = "20201014.0"

RPM_NAME = "swaks-20201014.0-2.7.noarch.rpm"
RPM_HASH = "73f939ea838c4e42586585436b568b6a1b41bae66ab685a8bbf24c28067e6584d3bc8c343d03c18bda298ac9ded601c0ddbac3075e97e262b359273885307627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swaks"
RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net-SSLeay"

inherit rpm
