SUMMARY = "API wrapper around the 'tar' utility"
DESCRIPTION = "*Archive::Tar::Wrapper* is an API wrapper around the 'tar' command line \
program. It never stores anything in memory, but works on temporary \
directory structures on disk instead. It provides a mapping between the \
logical paths in the tarball and the 'real' files in the temporary \
directory on disk. \
 \
It differs from Archive::Tar in two ways: \
 \
  * *Archive::Tar::Wrapper* almost doesn't hold anything in memory (see 'write' \
method), instead using disk as storage. \
 \
  * *Archive::Tar::Wrapper* is 100% compliant with the platform's 'tar' utility \
because it uses it internally."
LICENSE = "GPL-3.0-or-later"

PV = "0.38"

RPM_NAME = "perl-Archive-Tar-Wrapper-0.38-1.14.noarch.rpm"
RPM_HASH = "f7838c5b2356046817ddaf51920325a58da0e90aa5d73d5f6a8303bd5d7289f7980f99a10a394b08a9be0ebc7c5439361c3f3adf8577708329f10bf8e42d225a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Tar--Wrapper \
perl-Archive-Tar-Wrapper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CPAN--Meta \
perl-File--Which \
perl-IPC--Run \
perl-Log--Log4perl"

inherit rpm
