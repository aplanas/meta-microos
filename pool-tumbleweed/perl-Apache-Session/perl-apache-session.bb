SUMMARY = "Persistence framework for session data"
DESCRIPTION = "Apache::Session is a persistence framework which is particularly useful for \
tracking session data between httpd requests. Apache::Session is designed \
to work with Apache and mod_perl, but it should work under CGI and other \
web servers, and it also works outside of a web server altogether. \
 \
Apache::Session consists of five components: the interface, the object \
store, the lock manager, the ID generator, and the serializer. The \
interface is defined in Session.pm, which is meant to be easily subclassed. \
The object store can be the filesystem, a Berkeley DB, a MySQL DB, an \
Oracle DB, a Postgres DB, Sybase, or Informix. Locking is done by lock \
files, semaphores, or the locking capabilities of the various databases. \
Serialization is done via Storable, and optionally ASCII-fied via MIME or \
pack(). ID numbers are generated via MD5. The reader is encouraged to \
extend these capabilities to meet his own requirements. \
 \
A derived class of Apache::Session is used to tie together the three \
following components. The derived class inherits the interface from \
Apache::Session, and specifies which store and locker classes to use. \
Apache::Session::MySQL, for instance, uses the MySQL storage class and also \
the MySQL locking class. You can easily plug in your own object store or \
locker class."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.94"

RPM_NAME = "perl-Apache-Session-1.94-1.12.noarch.rpm"
RPM_HASH = "5e06e280ea6cc867059d5028529c32a86806bd619848fc7d9109397f36525ee714f075a108c3dd72a9924a6a165b56d1c2f16364f27364fafbdb4e53ff1370b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Apache::Session) \
perl(Apache::Session::DB_File) \
perl(Apache::Session::File) \
perl(Apache::Session::Flex) \
perl(Apache::Session::Generate::MD5) \
perl(Apache::Session::Generate::ModUniqueId) \
perl(Apache::Session::Generate::ModUsertrack) \
perl(Apache::Session::Informix) \
perl(Apache::Session::Lock::File) \
perl(Apache::Session::Lock::MySQL) \
perl(Apache::Session::Lock::Null) \
perl(Apache::Session::Lock::Semaphore) \
perl(Apache::Session::Lock::Sybase) \
perl(Apache::Session::MySQL) \
perl(Apache::Session::MySQL::NoLock) \
perl(Apache::Session::Oracle) \
perl(Apache::Session::Postgres) \
perl(Apache::Session::Serialize::Base64) \
perl(Apache::Session::Serialize::Storable) \
perl(Apache::Session::Serialize::Sybase) \
perl(Apache::Session::Serialize::UUEncode) \
perl(Apache::Session::Store::DBI) \
perl(Apache::Session::Store::DB_File) \
perl(Apache::Session::Store::File) \
perl(Apache::Session::Store::Informix) \
perl(Apache::Session::Store::MySQL) \
perl(Apache::Session::Store::Oracle) \
perl(Apache::Session::Store::Postgres) \
perl(Apache::Session::Store::Sybase) \
perl(Apache::Session::Sybase) \
perl-Apache-Session"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
