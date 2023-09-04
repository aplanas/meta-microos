SUMMARY = "perl Bindings for Git"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This package provides the Perl interface to the Git version control system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "perl-Git-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "b90b8c23f77d17ad381ea6db22ced608f731ed5772a76d6e8c3bebdce0b2ff47651ee7103c3d052646e0a9fdfc1e9cd706d4ee69e8c8bb700b03d2fd845bb6c6"

RPROVIDES:${PN} += "git-core-/usr/lib/perl5/vendor-perl/5.38.0/Git \
perl-Git \
perl-Git--Error--Command \
perl-Git--I18N \
perl-Git--IndexInfo \
perl-Git--LoadCPAN \
perl-Git--LoadCPAN--Error \
perl-Git--LoadCPAN--Mail--Address \
perl-Git--Packet \
perl-Git--SVN \
perl-Git--SVN--Editor \
perl-Git--SVN--Fetcher \
perl-Git--SVN--GlobSpec \
perl-Git--SVN--Log \
perl-Git--SVN--Memoize--YAML \
perl-Git--SVN--Migration \
perl-Git--SVN--Prompt \
perl-Git--SVN--Ra \
perl-Git--SVN--Utils \
perl-Git--activestate-pipe"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Error"

inherit rpm
