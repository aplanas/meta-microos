SUMMARY = "RPM Macros for Nagios based packages"
DESCRIPTION = "This package provides rpm macros for building packages for \
Nagios, check_mk and/or Icinga."
LICENSE = "BSD-3-Clause"

PV = "0.14"

RPM_NAME = "nagios-rpm-macros-0.14-3.6.noarch.rpm"
RPM_HASH = "e7618899c58bf5045ce16cc996f0df0187426478d3277b616c89ce5f6829efd7490188dc4765f0c624348b28f3cafb583cc20cbf9498d7c50ff76c71880cf008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-rpm-macros \
rpm-macro-icinga-cgi-logdir \
rpm-macro-icinga-cgidir \
rpm-macro-icinga-checkresultdir \
rpm-macro-icinga-chkfile \
rpm-macro-icinga-cmd-filedir \
rpm-macro-icinga-cmdfile \
rpm-macro-icinga-command-file \
rpm-macro-icinga-command-group \
rpm-macro-icinga-command-user \
rpm-macro-icinga-command-user-group-add \
rpm-macro-icinga-datadir \
rpm-macro-icinga-eventhandlerdir \
rpm-macro-icinga-group \
rpm-macro-icinga-http-authfile \
rpm-macro-icinga-ido2db-lockfile \
rpm-macro-icinga-ido2db-socketfile \
rpm-macro-icinga-idomod-tmpfile \
rpm-macro-icinga-libdir \
rpm-macro-icinga-localstatedir \
rpm-macro-icinga-lockfile \
rpm-macro-icinga-logdir \
rpm-macro-icinga-logrotatefile \
rpm-macro-icinga-plugindir \
rpm-macro-icinga-rundir \
rpm-macro-icinga-spooldir \
rpm-macro-icinga-state-retention-file \
rpm-macro-icinga-status-file \
rpm-macro-icinga-sysconfdir \
rpm-macro-icinga-tempdir \
rpm-macro-icinga-tempfile \
rpm-macro-icinga-user \
rpm-macro-icinga-user-group-add \
rpm-macro-icinga-webgroup \
rpm-macro-icinga2-cgi-logdir \
rpm-macro-icinga2-cgidir \
rpm-macro-icinga2-checkresultdir \
rpm-macro-icinga2-chkfile \
rpm-macro-icinga2-cmd-filedir \
rpm-macro-icinga2-cmdfile \
rpm-macro-icinga2-command-file \
rpm-macro-icinga2-command-group \
rpm-macro-icinga2-command-user \
rpm-macro-icinga2-command-user-group-add \
rpm-macro-icinga2-datadir \
rpm-macro-icinga2-eventhandlerdir \
rpm-macro-icinga2-group \
rpm-macro-icinga2-http-authfile \
rpm-macro-icinga2-ido2db-lockfile \
rpm-macro-icinga2-ido2db-socketfile \
rpm-macro-icinga2-idomod-tmpfile \
rpm-macro-icinga2-libdir \
rpm-macro-icinga2-localstatedir \
rpm-macro-icinga2-lockfile \
rpm-macro-icinga2-logdir \
rpm-macro-icinga2-logrotatefile \
rpm-macro-icinga2-plugindir \
rpm-macro-icinga2-rundir \
rpm-macro-icinga2-spooldir \
rpm-macro-icinga2-state-retention-file \
rpm-macro-icinga2-status-file \
rpm-macro-icinga2-sysconfdir \
rpm-macro-icinga2-tempdir \
rpm-macro-icinga2-tempfile \
rpm-macro-icinga2-user \
rpm-macro-icinga2-user-group-add \
rpm-macro-livestatus-agentsconfdir \
rpm-macro-livestatus-agentsdir \
rpm-macro-livestatus-agentslibdir \
rpm-macro-livestatus-check-mk-checks-mandir \
rpm-macro-livestatus-check-mk-configdir \
rpm-macro-livestatus-checksdir \
rpm-macro-livestatus-datadir \
rpm-macro-livestatus-htdocsdir \
rpm-macro-livestatus-icinga-confdir \
rpm-macro-livestatus-icinga-htdocsdir \
rpm-macro-livestatus-libdir \
rpm-macro-livestatus-livebackendsdir \
rpm-macro-livestatus-log-dir \
rpm-macro-livestatus-modulesdir \
rpm-macro-livestatus-nagconfdir \
rpm-macro-livestatus-notificationsdir \
rpm-macro-livestatus-rrddir \
rpm-macro-livestatus-socket-file \
rpm-macro-livestatus-socketdir \
rpm-macro-livestatus-sysconfdir \
rpm-macro-livestatus-vardir \
rpm-macro-livestatus-webdir \
rpm-macro-nagios-cgidir \
rpm-macro-nagios-command-file \
rpm-macro-nagios-command-group \
rpm-macro-nagios-command-user \
rpm-macro-nagios-command-user-group-add \
rpm-macro-nagios-datadir \
rpm-macro-nagios-eventhandlerdir \
rpm-macro-nagios-group \
rpm-macro-nagios-libdir \
rpm-macro-nagios-localstatedir \
rpm-macro-nagios-logdir \
rpm-macro-nagios-plugindir \
rpm-macro-nagios-spooldir \
rpm-macro-nagios-state-retention-file \
rpm-macro-nagios-status-file \
rpm-macro-nagios-sysconfdir \
rpm-macro-nagios-user \
rpm-macro-nagios-user-group-add \
rpm-macro-nagiosgrapher-sysconfdir \
rpm-macro-nrpe-sysconfdir \
rpm-macro-plugin-confdir \
rpm-macro-pnp4nagios-baseurl \
rpm-macro-pnp4nagios-datadir \
rpm-macro-pnp4nagios-datarootdir \
rpm-macro-pnp4nagios-libdir \
rpm-macro-pnp4nagios-logdir \
rpm-macro-pnp4nagios-perfdata-dir \
rpm-macro-pnp4nagios-perfdata-logfile \
rpm-macro-pnp4nagios-perfdata-spooldir \
rpm-macro-pnp4nagios-sysconfdir \
rpm-macro-pnp4nagios-templatedir"

RDEPENDS:${PN} += ""

inherit rpm
