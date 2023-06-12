SUMMARY = "RPM Macros for Nagios based packages"
DESCRIPTION = "This package provides rpm macros for building packages for \
Nagios, check_mk and/or Icinga."
LICENSE = "BSD-3-Clause"

PV = "0.14"

RPM_NAME = "nagios-rpm-macros-0.14-3.6.noarch.rpm"
RPM_HASH = "e7618899c58bf5045ce16cc996f0df0187426478d3277b616c89ce5f6829efd7490188dc4765f0c624348b28f3cafb583cc20cbf9498d7c50ff76c71880cf008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-rpm-macros \
rpm_macro(icinga2_cgi_logdir) \
rpm_macro(icinga2_cgidir) \
rpm_macro(icinga2_checkresultdir) \
rpm_macro(icinga2_chkfile) \
rpm_macro(icinga2_cmd_filedir) \
rpm_macro(icinga2_cmdfile) \
rpm_macro(icinga2_command_file) \
rpm_macro(icinga2_command_group) \
rpm_macro(icinga2_command_user) \
rpm_macro(icinga2_command_user_group_add) \
rpm_macro(icinga2_datadir) \
rpm_macro(icinga2_eventhandlerdir) \
rpm_macro(icinga2_group) \
rpm_macro(icinga2_http_authfile) \
rpm_macro(icinga2_ido2db_lockfile) \
rpm_macro(icinga2_ido2db_socketfile) \
rpm_macro(icinga2_idomod_tmpfile) \
rpm_macro(icinga2_libdir) \
rpm_macro(icinga2_localstatedir) \
rpm_macro(icinga2_lockfile) \
rpm_macro(icinga2_logdir) \
rpm_macro(icinga2_logrotatefile) \
rpm_macro(icinga2_plugindir) \
rpm_macro(icinga2_rundir) \
rpm_macro(icinga2_spooldir) \
rpm_macro(icinga2_state_retention_file) \
rpm_macro(icinga2_status_file) \
rpm_macro(icinga2_sysconfdir) \
rpm_macro(icinga2_tempdir) \
rpm_macro(icinga2_tempfile) \
rpm_macro(icinga2_user) \
rpm_macro(icinga2_user_group_add) \
rpm_macro(icinga_cgi_logdir) \
rpm_macro(icinga_cgidir) \
rpm_macro(icinga_checkresultdir) \
rpm_macro(icinga_chkfile) \
rpm_macro(icinga_cmd_filedir) \
rpm_macro(icinga_cmdfile) \
rpm_macro(icinga_command_file) \
rpm_macro(icinga_command_group) \
rpm_macro(icinga_command_user) \
rpm_macro(icinga_command_user_group_add) \
rpm_macro(icinga_datadir) \
rpm_macro(icinga_eventhandlerdir) \
rpm_macro(icinga_group) \
rpm_macro(icinga_http_authfile) \
rpm_macro(icinga_ido2db_lockfile) \
rpm_macro(icinga_ido2db_socketfile) \
rpm_macro(icinga_idomod_tmpfile) \
rpm_macro(icinga_libdir) \
rpm_macro(icinga_localstatedir) \
rpm_macro(icinga_lockfile) \
rpm_macro(icinga_logdir) \
rpm_macro(icinga_logrotatefile) \
rpm_macro(icinga_plugindir) \
rpm_macro(icinga_rundir) \
rpm_macro(icinga_spooldir) \
rpm_macro(icinga_state_retention_file) \
rpm_macro(icinga_status_file) \
rpm_macro(icinga_sysconfdir) \
rpm_macro(icinga_tempdir) \
rpm_macro(icinga_tempfile) \
rpm_macro(icinga_user) \
rpm_macro(icinga_user_group_add) \
rpm_macro(icinga_webgroup) \
rpm_macro(livestatus_agentsconfdir) \
rpm_macro(livestatus_agentsdir) \
rpm_macro(livestatus_agentslibdir) \
rpm_macro(livestatus_check_mk_checks_mandir) \
rpm_macro(livestatus_check_mk_configdir) \
rpm_macro(livestatus_checksdir) \
rpm_macro(livestatus_datadir) \
rpm_macro(livestatus_htdocsdir) \
rpm_macro(livestatus_icinga_confdir) \
rpm_macro(livestatus_icinga_htdocsdir) \
rpm_macro(livestatus_libdir) \
rpm_macro(livestatus_livebackendsdir) \
rpm_macro(livestatus_log_dir) \
rpm_macro(livestatus_modulesdir) \
rpm_macro(livestatus_nagconfdir) \
rpm_macro(livestatus_notificationsdir) \
rpm_macro(livestatus_rrddir) \
rpm_macro(livestatus_socket_file) \
rpm_macro(livestatus_socketdir) \
rpm_macro(livestatus_sysconfdir) \
rpm_macro(livestatus_vardir) \
rpm_macro(livestatus_webdir) \
rpm_macro(nagios_cgidir) \
rpm_macro(nagios_command_file) \
rpm_macro(nagios_command_group) \
rpm_macro(nagios_command_user) \
rpm_macro(nagios_command_user_group_add) \
rpm_macro(nagios_datadir) \
rpm_macro(nagios_eventhandlerdir) \
rpm_macro(nagios_group) \
rpm_macro(nagios_libdir) \
rpm_macro(nagios_localstatedir) \
rpm_macro(nagios_logdir) \
rpm_macro(nagios_plugindir) \
rpm_macro(nagios_spooldir) \
rpm_macro(nagios_state_retention_file) \
rpm_macro(nagios_status_file) \
rpm_macro(nagios_sysconfdir) \
rpm_macro(nagios_user) \
rpm_macro(nagios_user_group_add) \
rpm_macro(nagiosgrapher_sysconfdir) \
rpm_macro(nrpe_sysconfdir) \
rpm_macro(plugin_confdir) \
rpm_macro(pnp4nagios_baseurl) \
rpm_macro(pnp4nagios_datadir) \
rpm_macro(pnp4nagios_datarootdir) \
rpm_macro(pnp4nagios_libdir) \
rpm_macro(pnp4nagios_logdir) \
rpm_macro(pnp4nagios_perfdata_dir) \
rpm_macro(pnp4nagios_perfdata_logfile) \
rpm_macro(pnp4nagios_perfdata_spooldir) \
rpm_macro(pnp4nagios_sysconfdir) \
rpm_macro(pnp4nagios_templatedir)"
RDEPENDS:${PN} += ""

inherit rpm