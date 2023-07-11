SUMMARY = "Service processor access via IPMI"
DESCRIPTION = "OpenIPMI allows access to IPMI information on a server and to abstract it. \
 \
The device driver is included in the Linux kernel, and there is a \
user-level library available for it as well. This OpenIPMI package \
also includes the ipmicmd program, a program that can inject and \
receive messages."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "OpenIPMI-2.0.31-5.13.aarch64.rpm"
RPM_HASH = "2aa33dae7ea44712f38bdccbdc971fb3339bb9b23e300f915c3f3d30707798bc2ab4640f5e6b3d850b93f73be245a9cbdbf53a396a16eacbfa35cc1e38014ed8"

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
perl--MODULE-COMPAT-5.36.1"

inherit rpm
