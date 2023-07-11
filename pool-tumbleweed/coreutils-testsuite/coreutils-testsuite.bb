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

RPM_NAME = "coreutils-testsuite-9.3-1.2.aarch64.rpm"
RPM_HASH = "c0d993149481711fa7f2076c83e2485dc6b65bb55275c61a14b845dd87433f1444d892a94f24e478b8f2bcb7b804e9a19a6d5ccdad3e927631f0af537e31296a"

RPROVIDES:${PN} += "coreutils-testsuite"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
