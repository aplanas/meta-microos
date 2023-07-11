SUMMARY = "MH mailbox format support for Mailutils"
DESCRIPTION = "The implementation provides an interface between Mailutils and Emacs \
using the mh-e module. \
 \
To use Mailutils MH with Emacs, add the following line to \
site-start.el or .gnu-emacs file: (load 'mailutils-mh')"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-mh-3.16-1.3.aarch64.rpm"
RPM_HASH = "c84b74bfe66437ba9ca735f8c7494868f2b064b6c14ac2bb41319f4c7bd9d309f84464d52ca65fa47d576aefbfcd5e548e41f8d40376b0c4aa8ae1fd98e9a81a"

RPROVIDES:${PN} += "mailutils-mh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libmailutils.so.9 \
libmu-dotmail.so.9 \
libmu-imap.so.9 \
libmu-maildir.so.9 \
libmu-mailer.so.9 \
libmu-mbox.so.9 \
libmu-mh.so.9 \
libmu-pop.so.9 \
libmu-py.so.9 \
libmu-scm.so.9 \
libmu-sieve.so.9 \
libmuaux.so.9 \
libreadline.so.8 \
libtinfo.so.6 \
libunistring.so.5"

inherit rpm
