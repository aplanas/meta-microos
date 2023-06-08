SUMMARY = "Service processor access via IPMI"
DESCRIPTION = "OpenIPMI allows access to IPMI information on a server and to abstract it. \
 \
The device driver is included in the Linux kernel, and there is a \
user-level library available for it as well. This OpenIPMI package \
also includes the ipmicmd program, a program that can inject and \
receive messages."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "OpenIPMI-2.0.31-5.10.aarch64.rpm"
RPM_HASH = "7c12056f1a2438d6998d1e9a265693b980eeca50ddc10d2a716c136e2946daaa8327bd2102cf5cef766b42be75269cc30b37248fb22b3b62351efe8a597a33dc"

RPROVIDES:${PN} += "OpenIPMI OpenIPMI(aarch-64) config(OpenIPMI) ipmi_ui ipmicmd ipmilan libOpenIPMI.so.0()(64bit) perl(OpenIPMI) perl(OpenIPMI::argarray) perl(OpenIPMI::iargarray) perl(OpenIPMI::ipmi_args_t) perl(OpenIPMI::ipmi_channel_access_t) perl(OpenIPMI::ipmi_channel_info_t) perl(OpenIPMI::ipmi_cmdlang_event_t) perl(OpenIPMI::ipmi_cmdlang_t) perl(OpenIPMI::ipmi_control_id_t) perl(OpenIPMI::ipmi_control_t) perl(OpenIPMI::ipmi_domain_id_t) perl(OpenIPMI::ipmi_domain_t) perl(OpenIPMI::ipmi_entity_id_t) perl(OpenIPMI::ipmi_entity_t) perl(OpenIPMI::ipmi_event_t) perl(OpenIPMI::ipmi_fru_node_t) perl(OpenIPMI::ipmi_fru_t) perl(OpenIPMI::ipmi_lan_config_t) perl(OpenIPMI::ipmi_lanparm_t) perl(OpenIPMI::ipmi_mc_t) perl(OpenIPMI::ipmi_mcid_t) perl(OpenIPMI::ipmi_pef_config_t) perl(OpenIPMI::ipmi_pef_t) perl(OpenIPMI::ipmi_pet_t) perl(OpenIPMI::ipmi_sensor_id_t) perl(OpenIPMI::ipmi_sensor_t) perl(OpenIPMI::ipmi_sol_config_t) perl(OpenIPMI::ipmi_sol_conn_t) perl(OpenIPMI::ipmi_solparm_t) perl(OpenIPMI::ipmi_user_t) perl(OpenIPMI::strconstarray) perl(OpenIPMIc)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libIPMIlanserv.so.0()(64bit) libOpenIPMIcmdlang.so.0()(64bit) libOpenIPMIglib.so.0()(64bit) libOpenIPMIposix.so.0()(64bit) libOpenIPMIui.so.1()(64bit) libOpenIPMIutils.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdbm.so.6()(64bit) libglib-2.0.so.0()(64bit) libgthread-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libnetsnmp.so.40()(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libreadline.so.8()(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
