SUMMARY = "MH mailbox format support for Mailutils"
DESCRIPTION = "The implementation provides an interface between Mailutils and Emacs \
using the mh-e module. \
 \
To use Mailutils MH with Emacs, add the following line to \
site-start.el or .gnu-emacs file: (load 'mailutils-mh')"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-mh-3.16-1.2.aarch64.rpm"
RPM_HASH = "71e986ee19317d5b99fe783fa2245596799462dbbe2cdf2f1298dcc368e4ad1e4cac06692fb2d6ec0f467269ee20d20139b3c7ccc3bef117a817c2cdba415f4c"

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
