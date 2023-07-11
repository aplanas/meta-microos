SUMMARY = "Read, eval, print, loop, yay!"
DESCRIPTION = "NOTE: This is an early release, and implementation details of this module \
are still very much in flux. Feedback is welcome! \
 \
Reply is a lightweight, extensible REPL for Perl. It is plugin-based (see \
Reply::Plugin), and through plugins supports many advanced features such as \
coloring and pretty printing, readline support, and pluggable commands."
LICENSE = "MIT"

PV = "0.42"

RPM_NAME = "perl-Reply-0.42-1.13.noarch.rpm"
RPM_HASH = "b276e9a85523f34ad362f6472a022a6b96356b2ade5aca92b78628c6e18fc479129cdedb8bb6c57b330f0d9f16397532593d3d0d7600735e07ed79aa1fe3d830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Reply \
perl-Reply--App \
perl-Reply--Config \
perl-Reply--Plugin \
perl-Reply--Plugin--AutoRefresh \
perl-Reply--Plugin--Autocomplete--Commands \
perl-Reply--Plugin--Autocomplete--Functions \
perl-Reply--Plugin--Autocomplete--Globals \
perl-Reply--Plugin--Autocomplete--Keywords \
perl-Reply--Plugin--Autocomplete--Lexicals \
perl-Reply--Plugin--Autocomplete--Methods \
perl-Reply--Plugin--Autocomplete--Packages \
perl-Reply--Plugin--CollapseStack \
perl-Reply--Plugin--Colors \
perl-Reply--Plugin--DataDump \
perl-Reply--Plugin--DataDumper \
perl-Reply--Plugin--DataPrinter \
perl-Reply--Plugin--Defaults \
perl-Reply--Plugin--Editor \
perl-Reply--Plugin--FancyPrompt \
perl-Reply--Plugin--Hints \
perl-Reply--Plugin--Interrupt \
perl-Reply--Plugin--LexicalPersistence \
perl-Reply--Plugin--LoadClass \
perl-Reply--Plugin--Nopaste \
perl-Reply--Plugin--Packages \
perl-Reply--Plugin--Pager \
perl-Reply--Plugin--ReadLine \
perl-Reply--Plugin--ResultCache \
perl-Reply--Plugin--Timer \
perl-Reply--Util"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Config--INI--Reader--Ordered \
perl-Devel--LexAlias \
perl-Eval--Closure \
perl-File--HomeDir \
perl-Getopt--Long \
perl-Module--Runtime \
perl-Package--Stash \
perl-PadWalker \
perl-Try--Tiny"

inherit rpm
