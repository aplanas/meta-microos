SUMMARY = "Additional Unix Utilities — Perl scripts"
DESCRIPTION = "This is a growing collection of the Unix tools that nobody thought to write long ago, when Unix was young. \
 \
This subpackage includes the following utilities: \
 \
  - combine: combine the lines in two files using boolean operations \
  - vidir: edit a directory in your text editor \
  - vipe: insert a text editor into a pipe \
  - zrun: automatically uncompress arguments to command"
LICENSE = "GPL-2.0-or-later"

PV = "0.67"

RPM_NAME = "moreutils-perl-0.67-2.2.noarch.rpm"
RPM_HASH = "68d2d08c2f8adadfd98915d682852f31b08173d1f4d3886a3a7e8a768f973a4d142b99f3f37d61794766dbf5428823b1ec307ac8c9b0e2108e5f007b0c5a836d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moreutils-perl \
moreutils:/usr/bin/combine \
moreutils:/usr/bin/vidir \
moreutils:/usr/bin/vipe \
moreutils:/usr/bin/zrun"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(File::Basename) \
perl(File::Path) \
perl(File::Spec) \
perl(File::Temp) \
perl(Getopt::Long) \
perl(IO::Handle) \
perl(strict) \
perl(warnings)"

inherit rpm
