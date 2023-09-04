SUMMARY = "Security and System auditing tool"
DESCRIPTION = "Lynis is a security and system auditing tool. It scans a system on the \
most interesting parts useful for audits, like: \
     - Security enhancements \
     - Logging and auditing options \
     - Banner identification \
     - Software availability"
LICENSE = "GPL-3.0-only"

PV = "3.0.9"

RPM_NAME = "lynis-3.0.9-1.1.noarch.rpm"
RPM_HASH = "4c4155efca58a1372b05e1eb47ceef1a87ee541675c232ccac2243abd587b428aad8053556b360236fd2bc07a44a53c3e077c799beb61f757c27b8686dfc30a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lynis \
lynis"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
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
