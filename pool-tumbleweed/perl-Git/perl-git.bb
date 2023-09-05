SUMMARY = "perl Bindings for Git"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This package provides the Perl interface to the Git version control system."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "perl-Git-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "e19638154d789beef14a0c3aa1c88acaa6ce13c51015674d2b2073cda30756f6d44cd70c2ef214d6c735ba432dadea5cb39d5ba3273796f540d2e5e9157010b9"

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
