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

RPM_NAME = "perl-Archive-Tar-Wrapper-0.38-1.13.noarch.rpm"
RPM_HASH = "c90e1d5572b5d49af5ce21307da637910604949bb8846c3b0c0585fd12eeb58569726a22068b62bef9f22fe5075241298f4fb435dc535056f1bc01bc73002c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Tar--Wrapper \
perl-Archive-Tar-Wrapper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Meta \
perl-File--Which \
perl-IPC--Run \
perl-Log--Log4perl"

inherit rpm
