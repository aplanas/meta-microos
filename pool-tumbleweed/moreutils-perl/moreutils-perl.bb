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

RPM_NAME = "moreutils-perl-0.67-2.3.noarch.rpm"
RPM_HASH = "99679411927430460d6a8be97b2f26efc96ff274d0b57913a8ed2a46c39c63b027a992b3300592cb9cb1dbb152b3f117c7525b1d9d24c70f8b44ebf13866443e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moreutils-/usr/bin/combine \
moreutils-/usr/bin/vidir \
moreutils-/usr/bin/vipe \
moreutils-/usr/bin/zrun \
moreutils-perl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-File--Basename \
perl-File--Path \
perl-File--Spec \
perl-File--Temp \
perl-Getopt--Long \
perl-IO--Handle \
perl-strict \
perl-warnings"

inherit rpm
