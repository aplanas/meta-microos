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

PV = "9.4"

RPM_NAME = "coreutils-testsuite-9.4-1.1.aarch64.rpm"
RPM_HASH = "9d26848f0465274e6fea21042dafa327fb09af10be84debe93d787e5c826c249c3856524707211a4955103b06e66bfeeb20f3e02e9e420fe61c814c6fd708e9a"

RPROVIDES:${PN} += "coreutils-testsuite"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
