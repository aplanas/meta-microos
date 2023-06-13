SUMMARY = "Read, eval, print, loop, yay!"
DESCRIPTION = "NOTE: This is an early release, and implementation details of this module \
are still very much in flux. Feedback is welcome! \
 \
Reply is a lightweight, extensible REPL for Perl. It is plugin-based (see \
Reply::Plugin), and through plugins supports many advanced features such as \
coloring and pretty printing, readline support, and pluggable commands."
LICENSE = "MIT"

PV = "0.42"

RPM_NAME = "perl-Reply-0.42-1.12.noarch.rpm"
RPM_HASH = "aafa32b8504f3d8b328b901e53dad8b682f58e195a34030c82ada4ed75bec206aac34a81bb55a8816ff951fa031c9867eb15a9411adffe9a59c7dd4f310bcaa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Reply) \
perl(Reply::App) \
perl(Reply::Config) \
perl(Reply::Plugin) \
perl(Reply::Plugin::AutoRefresh) \
perl(Reply::Plugin::Autocomplete::Commands) \
perl(Reply::Plugin::Autocomplete::Functions) \
perl(Reply::Plugin::Autocomplete::Globals) \
perl(Reply::Plugin::Autocomplete::Keywords) \
perl(Reply::Plugin::Autocomplete::Lexicals) \
perl(Reply::Plugin::Autocomplete::Methods) \
perl(Reply::Plugin::Autocomplete::Packages) \
perl(Reply::Plugin::CollapseStack) \
perl(Reply::Plugin::Colors) \
perl(Reply::Plugin::DataDump) \
perl(Reply::Plugin::DataDumper) \
perl(Reply::Plugin::DataPrinter) \
perl(Reply::Plugin::Defaults) \
perl(Reply::Plugin::Editor) \
perl(Reply::Plugin::FancyPrompt) \
perl(Reply::Plugin::Hints) \
perl(Reply::Plugin::Interrupt) \
perl(Reply::Plugin::LexicalPersistence) \
perl(Reply::Plugin::LoadClass) \
perl(Reply::Plugin::Nopaste) \
perl(Reply::Plugin::Packages) \
perl(Reply::Plugin::Pager) \
perl(Reply::Plugin::ReadLine) \
perl(Reply::Plugin::ResultCache) \
perl(Reply::Plugin::Timer) \
perl(Reply::Util) \
perl-Reply"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Config::INI::Reader::Ordered) \
perl(Devel::LexAlias) \
perl(Eval::Closure) \
perl(File::HomeDir) \
perl(Getopt::Long) \
perl(Module::Runtime) \
perl(Package::Stash) \
perl(PadWalker) \
perl(Try::Tiny)"

inherit rpm
