SUMMARY = "Systemd service files and config files for openSUSE container"
DESCRIPTION = "This package contains the configuration files and systemd units \
to run the openSUSE containers via podman managed by systemd. \
Currently supported are bind, cups, dhcp-server, dovecot, fetchmail, haproxy, \
mariadb, minidlna, nginx, openldap, postfix, roundcube, samba, \
spamassassin, squid and wsdd. Additional, there is a timer to cleanup \
dangling container images."
LICENSE = "MIT"

PV = "0.0+git20230324.9cd3b7a"

RPM_NAME = "containers-systemd-0.0+git20230324.9cd3b7a-1.1.noarch.rpm"
RPM_HASH = "ba825f0006e296d3c0c4f457c3b1c4290bcb28004d48c4e8bfbe3f4713e183f1c50404378c39b0054a5cb4d083f91399bb319e5ff05d070ee7fd0642f1ff2d69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-containers-systemd \
containers-systemd"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
