SUMMARY = "Runs a command quietly unless it fails"
DESCRIPTION = "chronic runs a command, and arranges for its standard out and standard \
error to only be displayed if the command fails (exits nonzero or crashes). \
If the command succeeds, any extraneous output will be hidden. \
 \
A common use for chronic is for running a cron job. Rather than \
trying to keep the command quiet, and having to deal with mails containing \
accidental output when it succeeds, and not verbose enough output when it \
fails, you can just run it verbosely always, and use chronic to hide \
the successful output."
LICENSE = "GPL-2.0-or-later"

PV = "0.67"

RPM_NAME = "chronic-0.67-2.3.noarch.rpm"
RPM_HASH = "4c68c9553d50583eae73a1d08727179b571da8c31f55e92da1ce466c57abe2880f184a3a952236ec59cae59338417b52b73b58a9fdcf7ea4c9d155e74905f83b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chronic \
moreutils-/usr/bin/chronic"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Getopt--Std \
perl-IPC--Run \
perl-strict \
perl-warnings"

inherit rpm
