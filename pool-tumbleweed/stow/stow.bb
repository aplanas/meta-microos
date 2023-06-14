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

RPM_NAME = "stow-2.3.1-1.10.noarch.rpm"
RPM_HASH = "f402413fb706af7f31eee7157baf6c6b9f88d9962bc78d959627c469488515d445c78535200852ccdabb2c7da33d5f6bee9f5b248989338c84d7dd4109689cb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Stow \
perl-Stow--Util \
stow"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
perl \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
