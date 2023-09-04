SUMMARY = "Service processor access via IPMI"
DESCRIPTION = "OpenIPMI allows access to IPMI information on a server and to abstract it. \
 \
The device driver is included in the Linux kernel, and there is a \
user-level library available for it as well. This OpenIPMI package \
also includes the ipmicmd program, a program that can inject and \
receive messages."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "OpenIPMI-2.0.31-5.14.aarch64.rpm"
RPM_HASH = "35b425e0e984daa91449e9e07f0762b1dc71795107064f01bbc4f7cd133a397c30d37fe831852648d87bca158b9b693701983b35f390659b5e84ab9931fc97b9"

RPROVIDES:${PN} += "OpenIPMI \
config-OpenIPMI \
ipmi-ui \
ipmicmd \
ipmilan \
libOpenIPMI.so.0 \
perl-OpenIPMI \
perl-OpenIPMI--argarray \
perl-OpenIPMI--iargarray \
perl-OpenIPMI--ipmi-args-t \
perl-OpenIPMI--ipmi-channel-access-t \
perl-OpenIPMI--ipmi-channel-info-t \
perl-OpenIPMI--ipmi-cmdlang-event-t \
perl-OpenIPMI--ipmi-cmdlang-t \
perl-OpenIPMI--ipmi-control-id-t \
perl-OpenIPMI--ipmi-control-t \
perl-OpenIPMI--ipmi-domain-id-t \
perl-OpenIPMI--ipmi-domain-t \
perl-OpenIPMI--ipmi-entity-id-t \
perl-OpenIPMI--ipmi-entity-t \
perl-OpenIPMI--ipmi-event-t \
perl-OpenIPMI--ipmi-fru-node-t \
perl-OpenIPMI--ipmi-fru-t \
perl-OpenIPMI--ipmi-lan-config-t \
perl-OpenIPMI--ipmi-lanparm-t \
perl-OpenIPMI--ipmi-mc-t \
perl-OpenIPMI--ipmi-mcid-t \
perl-OpenIPMI--ipmi-pef-config-t \
perl-OpenIPMI--ipmi-pef-t \
perl-OpenIPMI--ipmi-pet-t \
perl-OpenIPMI--ipmi-sensor-id-t \
perl-OpenIPMI--ipmi-sensor-t \
perl-OpenIPMI--ipmi-sol-config-t \
perl-OpenIPMI--ipmi-sol-conn-t \
perl-OpenIPMI--ipmi-solparm-t \
perl-OpenIPMI--ipmi-user-t \
perl-OpenIPMI--strconstarray \
perl-OpenIPMIc"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libIPMIlanserv.so.0 \
libOpenIPMIcmdlang.so.0 \
libOpenIPMIglib.so.0 \
libOpenIPMIposix.so.0 \
libOpenIPMIui.so.1 \
libOpenIPMIutils.so.0 \
libc.so.6 \
libgdbm.so.6 \
libglib-2.0.so.0 \
libgthread-2.0.so.0 \
libm.so.6 \
libnetsnmp.so.40 \
libpopt.so.0 \
libreadline.so.8 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
