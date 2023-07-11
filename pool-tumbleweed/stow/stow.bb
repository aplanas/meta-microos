SUMMARY = "Manage the installation of software packages from source"
DESCRIPTION = "GNU Stow is a symlink farm manager which takes distinct packages of \
software and/or data located in separate directories on the \
filesystem, and makes them appear to be installed in the same place. \
For example, /usr/local/bin could contain symlinks to files within \
/usr/local/stow/emacs/bin, /usr/local/stow/perl/bin etc., and \
likewise recursively for any other subdirectories such as .../share, \
.../man, and so on. \
 \
This is particularly useful for keeping track of system-wide and \
per-user installations of software built from source, but can also \
facilitate a more controlled approach to management of configuration \
files in the user's home directory, especially when coupled with \
version control systems. \
 \
Stow is implemented as a combination of a Perl script providing a CLI \
interface, and a backend Perl module which does most of the work."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.1"

RPM_NAME = "stow-2.3.1-1.11.noarch.rpm"
RPM_HASH = "3193ad337e0b8d48153527bc2a29c4a413c3b564206efa11e589008f19939b19fe1e5a8797413b0bf6178a3b570efdf143f94fdc8e706452c54225de19e802ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Stow \
perl-Stow--Util \
stow"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
