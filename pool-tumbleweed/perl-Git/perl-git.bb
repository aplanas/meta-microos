SUMMARY = "perl Bindings for Git"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This package provides the Perl interface to the Git version control system."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "perl-Git-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "22c1e1b9fdc13e1bb151cf7a75792fa5cdd28752c9fb3b4bcd586caf9bdd61eb027f062f346b7a38cf8838283dd1065bc633fe975b5f370f953b03810cf8e15e"

RPROVIDES:${PN} += "git-core:/usr/lib/perl5/vendor_perl/5.36.0/Git \
perl(Git) \
perl(Git::Error::Command) \
perl(Git::I18N) \
perl(Git::IndexInfo) \
perl(Git::LoadCPAN) \
perl(Git::LoadCPAN::Error) \
perl(Git::LoadCPAN::Mail::Address) \
perl(Git::Packet) \
perl(Git::SVN) \
perl(Git::SVN::Editor) \
perl(Git::SVN::Fetcher) \
perl(Git::SVN::GlobSpec) \
perl(Git::SVN::Log) \
perl(Git::SVN::Memoize::YAML) \
perl(Git::SVN::Migration) \
perl(Git::SVN::Prompt) \
perl(Git::SVN::Ra) \
perl(Git::SVN::Utils) \
perl(Git::activestate_pipe) \
perl-Git \
perl-Git(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl-Error"

inherit rpm
