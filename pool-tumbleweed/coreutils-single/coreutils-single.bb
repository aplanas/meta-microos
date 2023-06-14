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

RPM_NAME = "coreutils-single-9.3-1.1.aarch64.rpm"
RPM_HASH = "4d23b0980a959591d6d4541c672b3034e095f516c7464cd2f54ccab9cdb3b43428499458bfae4e51b9425aa1f3ea22238689a0f7303bb0aa1435fae07b43786b"

RPROVIDES:${PN} += "/bin/cat \
/bin/chgrp \
/bin/chmod \
/bin/chown \
/bin/cp \
/bin/dd \
/bin/df \
/bin/echo \
/bin/false \
/bin/ln \
/bin/ls \
/bin/mkdir \
/bin/mknod \
/bin/mktemp \
/bin/mv \
/bin/pwd \
/bin/rm \
/bin/rmdir \
/bin/sleep \
/bin/sort \
/bin/stty \
/bin/sync \
/bin/touch \
/bin/true \
/bin/uname \
coreutils \
coreutils-single \
fileutils \
libstdbuf.so \
mktemp \
sh-utils \
stat \
textutils"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libattr.so.1 \
libc.so.6 \
libcap.so.2 \
libgmp.so.10 \
libselinux.so.1"

inherit rpm
