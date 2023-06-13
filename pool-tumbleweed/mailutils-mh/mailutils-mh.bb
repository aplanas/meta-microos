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

RPROVIDES:${PN} += "mailutils-mh \
mailutils-mh(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libguile-3.0.so.1()(64bit) \
libmailutils.so.9()(64bit) \
libmu_dotmail.so.9()(64bit) \
libmu_imap.so.9()(64bit) \
libmu_maildir.so.9()(64bit) \
libmu_mailer.so.9()(64bit) \
libmu_mbox.so.9()(64bit) \
libmu_mh.so.9()(64bit) \
libmu_pop.so.9()(64bit) \
libmu_py.so.9()(64bit) \
libmu_scm.so.9()(64bit) \
libmu_sieve.so.9()(64bit) \
libmuaux.so.9()(64bit) \
libreadline.so.8()(64bit) \
libtinfo.so.6()(64bit) \
libunistring.so.5()(64bit)"

inherit rpm
