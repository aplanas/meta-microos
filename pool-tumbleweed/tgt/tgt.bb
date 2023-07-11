SUMMARY = "Generic Linux target framework (tgt)"
DESCRIPTION = "Linux target framework (tgt) aims to simplify various SCSI target \
driver (iSCSI, Fibre Channel, SRP, etc) creation and maintenance. \
 \
Tgt consists of kernel modules, user-space daemon, and user-space \
tools. Some target drivers uses all of them and some use only \
user-space daemon and tools (i.e. they completely runs in user space)."
LICENSE = "GPL-2.0-only"

PV = "1.0.85"

RPM_NAME = "tgt-1.0.85-1.5.aarch64.rpm"
RPM_HASH = "c8a874999576b129bd13b70e3a0789c422116f3092fa675db6c074d3a9fce3f37908bf17d158739cb97892822151c3935070346a9c431c2d6cb2ffcbb5216bac"

RPROVIDES:${PN} += "config-tgt \
tgt"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libaio.so.1 \
libc.so.6 \
perl-Config-General \
systemd"

inherit rpm
