SUMMARY = "Testsuite for MariaDB"
DESCRIPTION = "This package contains the test scripts and data for MariaDB. \
 \
To run the testsuite, run /usr/share/mysql-test/suse-test-run."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "mariadb-test-10.11.3-1.1.aarch64.rpm"
RPM_HASH = "4d1f9f3a5f7e0c3e40bb9d7d580ef9fb64c7316860585dbf0d4dbe15b45b8fba3ccca816239e7cf3e0c058dd4afd9cac412fa3c1da918c265df32eba5de578ad"

RPROVIDES:${PN} += "mariadb-test \
mariadb-test(aarch-64) \
mysql-test \
perl(My::Config) \
perl(My::Config::Group) \
perl(My::Config::Group::ENV) \
perl(My::Config::Group::OPT) \
perl(My::Config::Option) \
perl(My::ConfigFactory) \
perl(My::CoreDump) \
perl(My::Debugger) \
perl(My::File::Path) \
perl(My::Find) \
perl(My::Handles) \
perl(My::Options) \
perl(My::Platform) \
perl(My::SafeProcess) \
perl(My::SafeProcess::Base) \
perl(My::Suite) \
perl(My::Suite::Archive) \
perl(My::Suite::AuthGSSAPI) \
perl(My::Suite::BinlogEncryption) \
perl(My::Suite::CTest) \
perl(My::Suite::Connect) \
perl(My::Suite::Disks) \
perl(My::Suite::Encryption) \
perl(My::Suite::Federated) \
perl(My::Suite::Func_test) \
perl(My::Suite::GALERA_3NODES) \
perl(My::Suite::GALERA_3NODES_SR) \
perl(My::Suite::Galera) \
perl(My::Suite::Galera_sr) \
perl(My::Suite::MTR2::MyISAM) \
perl(My::Suite::MTR::Example) \
perl(My::Suite::Main) \
perl(My::Suite::Maria) \
perl(My::Suite::MariaBackup) \
perl(My::Suite::Metadata_lock_info) \
perl(My::Suite::OQGraph) \
perl(My::Suite::Plugins) \
perl(My::Suite::Query_response_time) \
perl(My::Suite::Rocksdb) \
perl(My::Suite::Rocksdb_sys_vars) \
perl(My::Suite::S3) \
perl(My::Suite::SQL_Discovery) \
perl(My::Suite::Sequence) \
perl(My::Suite::Sphinx) \
perl(My::Suite::Spider) \
perl(My::Suite::Sysschema) \
perl(My::Suite::Type_inet) \
perl(My::Suite::Type_test) \
perl(My::Suite::Type_uuid) \
perl(My::Suite::User_variables) \
perl(My::Suite::WSREP) \
perl(My::Suite::WSREP_INFO) \
perl(My::SysInfo) \
perl(My::Tee) \
perl(My::Test) \
perl(mtr_cases) \
perl(mtr_match) \
perl(mtr_report) \
perl(mtr_results) \
perl(mtr_unique) \
perl(wsrep::common)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libaio.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmariadb_plugins \
libpam.so.0()(64bit) \
libpcre2-8.so.0()(64bit) \
libpcre2-posix.so.3()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
mariadb \
mariadb-bench \
mariadb-client \
mariadb-tools \
perl(Data::Dumper) \
perl(Env) \
perl(Exporter) \
perl(Fcntl) \
perl(File::Temp) \
perl(Getopt::Long) \
perl(IPC::Open3) \
perl(Memoize) \
perl(Socket) \
perl(Symbol) \
perl(Sys::Hostname) \
perl(Test::More) \
perl(Time::HiRes) \
perl-DBD-mysql \
procps \
time"

inherit rpm
