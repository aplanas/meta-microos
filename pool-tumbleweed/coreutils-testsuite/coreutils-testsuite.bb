SUMMARY = "GNU Core Utilities"
DESCRIPTION = "These are the GNU core utilities.  This package is the union of \
the GNU fileutils, sh-utils, and textutils packages. \
 \
  [ arch b2sum base32 base64 basename basenc cat chcon chgrp chmod chown chroot \
  cksum comm cp csplit cut date dd df dir dircolors dirname du echo env expand \
  expr factor false fmt fold groups head hostid id install join \
  link ln logname ls md5sum mkdir mkfifo mknod mktemp mv nice nl nohup \
  nproc numfmt od paste pathchk pinky pr printenv printf ptx pwd readlink \
  realpath rm rmdir runcon seq sha1sum sha224sum sha256sum sha384sum sha512sum \
  shred shuf sleep sort split stat stdbuf stty sum sync tac tail tee test \
  timeout touch tr true truncate tsort tty uname unexpand uniq unlink \
  uptime users vdir wc who whoami yes"
LICENSE = "GPL-3.0-or-later"

PV = "9.3"

RPM_NAME = "coreutils-testsuite-9.3-1.1.aarch64.rpm"
RPM_HASH = "8ac467a16b3f6b6c6097b75d1e41a2b77e51efb78395bb23c790cf84df8574e5b9815f753f912ac887560458369377f82b7c59c5f8b0af3fa2a9c93ec5383db6"

RPROVIDES:${PN} += "coreutils-testsuite \
coreutils-testsuite(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
