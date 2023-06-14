SUMMARY = "Security and System auditing tool"
DESCRIPTION = "Lynis is a security and system auditing tool. It scans a system on the \
most interesting parts useful for audits, like: \
     - Security enhancements \
     - Logging and auditing options \
     - Banner identification \
     - Software availability"
LICENSE = "GPL-3.0-only"

PV = "3.0.8"

RPM_NAME = "lynis-3.0.8-1.4.noarch.rpm"
RPM_HASH = "fdf74cd0bb4d57eedc0319208c9946a5ec704a6f8c967a3af2733e0e305c3c2b42df7ff0ad4140eb59c3b57a0dc67181a0c403201f8e8e686b9c8eed4f38e2c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lynis \
lynis"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
bash \
cron \
fillup \
findutils \
libnss-usrfiles2 \
logrotate \
net-tools-deprecated \
netcfg \
wget"

inherit rpm
