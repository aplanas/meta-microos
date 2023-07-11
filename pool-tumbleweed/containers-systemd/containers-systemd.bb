SUMMARY = "Systemd service files and config files for openSUSE container"
DESCRIPTION = "This package contains the configuration files and systemd units \
to run the openSUSE containers via podman managed by systemd. \
Currently supported are bind, cups, dhcp-server, dovecot, fetchmail, haproxy, \
mariadb, minidlna, nginx, openldap, postfix, roundcube, samba, \
spamassassin, squid and wsdd. Additional, there is a timer to cleanup \
dangling container images."
LICENSE = "MIT"

PV = "0.0+git20230324.9cd3b7a"

RPM_NAME = "containers-systemd-0.0+git20230324.9cd3b7a-1.2.noarch.rpm"
RPM_HASH = "e2846cfb480b17da9c98e0c8953920281c95f69f13ecddd70bb6f846f93c3906cc0129b0592a8cc8a6ee6e935f1de344f765adf36cc6585c17f11ae778ed1b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-containers-systemd \
containers-systemd"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
