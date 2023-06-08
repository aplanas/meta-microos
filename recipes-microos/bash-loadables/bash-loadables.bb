SUMMARY = "Loadable bash builtins"
DESCRIPTION = "This package contains the examples for the ready-to-dynamic-load \
builtins found in the source tar ball of the bash: \
 \
basename      Return non-directory portion of pathname. \
 \
cut	      cut(1) replacement. \
 \
dirname       Return directory portion of pathname. \
 \
finfo	      Print file info. \
 \
getconf       POSIX.2 getconf utility. \
 \
head	      Copy first part of files. \
 \
id	      POSIX.2 user identity. \
 \
ln	      Make links. \
 \
logname       Print login name of current user. \
 \
mkdir	      Make directories. \
 \
pathchk       Check pathnames for validity and portability. \
 \
print	      Loadable ksh-93 style print builtin. \
 \
printenv      Minimal builtin clone of BSD printenv(1). \
 \
push	      Anyone remember TOPS-20? \
 \
realpath      Canonicalize pathnames, resolving symlinks. \
 \
rmdir	      Remove directory. \
 \
sleep	      sleep for fractions of a second. \
 \
strftime      Loadable builtin interface to strftime(3). \
 \
sync	      Sync the disks by forcing pending filesystem writes to \
complete. \
 \
tee	      Duplicate standard input. \
 \
tty	      Return terminal name. \
 \
uname	      Print system information. \
 \
unlink	      Remove a directory entry. \
 \
whoami	      Print out username of current user."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-loadables-5.2.15-8.3.aarch64.rpm"
RPM_HASH = "e8522f9c06d1407f57aa0d2ba2416700a9a0b654bcd98fd6d01f36df8e79cc0332814545c7a6256371441694eecf31a804b55347aa47d5453eafa1b8379c3b44"

RPROVIDES:${PN} += "bash-loadables bash-loadables(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
