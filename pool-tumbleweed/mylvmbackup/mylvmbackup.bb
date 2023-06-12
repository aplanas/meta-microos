SUMMARY = "Utility for creating MySQL backups via LVM snapshots"
DESCRIPTION = "mylvmbackup is a script for quickly creating backups of MySQL server's data \
files. To perform a backup, mylvmbackup obtains a read lock on all tables and \
flushes all server caches to disk, makes an LVM snapshot of the volume \
containing the MySQL data directory, and unlocks the tables again. The snapshot \
process takes only a small amount of time. When it is done, the server can \
continue normal operations, while the actual file backup proceeds."
LICENSE = "GPL-2.0+"

PV = "0.16"

RPM_NAME = "mylvmbackup-0.16-2.16.noarch.rpm"
RPM_HASH = "656be6d4399eb2e02f49a8b45451d1ad43ae1872b8aea3285663a1c895b8a1d7960fe3301fe9a12cd02c0f1b433a7033c0fcdcae1513602e912d241683459dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mylvmbackup) \
mylvmbackup \
perl(backupfailure) \
perl(logerr) \
perl(preflush)"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(Config::IniFiles) \
perl(DBD::mysql) \
perl(DBI) \
perl(Date::Format) \
perl(Fcntl) \
perl(File::Basename) \
perl(File::Copy) \
perl(File::Copy::Recursive) \
perl(File::Path) \
perl(File::Temp) \
perl(Getopt::Long) \
perl(Sys::Hostname)"

inherit rpm
