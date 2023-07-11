SUMMARY = "perl Bindings for Git"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This package provides the Perl interface to the Git version control system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "perl-Git-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "bf03a4163d210ef2f042e249ae0f08cdf62f8cfbd980f8d558e91fb9f40f2f32571431bcb2c0764b833910e95817e04376e43a02f9726411b6a0d062a65067eb"

RPROVIDES:${PN} += "git-core-/usr/lib/perl5/vendor-perl/5.36.1/Git \
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Error"

inherit rpm
