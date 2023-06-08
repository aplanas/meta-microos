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

RPM_NAME = "chronic-0.67-2.2.noarch.rpm"
RPM_HASH = "26224bf744c0cb6259834d806ccce1cd8b8718c2361bba21882a8600c90b94197411a8f97e132c276eafe4293ce82ae3da22b3aeb4ae89197e5117ed32756bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chronic moreutils:/usr/bin/chronic"
RDEPENDS:${PN} += "/usr/bin/perl perl(Getopt::Std) perl(IPC::Run) perl(strict) perl(warnings)"

inherit rpm
