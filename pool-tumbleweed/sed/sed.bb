SUMMARY = "A Stream-Oriented Non-Interactive Text Editor"
DESCRIPTION = "Sed takes text input, performs one or more operations on it, and \
outputs the modified text. Sed is typically used for extracting parts \
of a file using pattern matching or  for substituting multiple \
occurrences of a string within a file."
LICENSE = "GPL-3.0-or-later"

PV = "4.9"

RPM_NAME = "sed-4.9-2.4.aarch64.rpm"
RPM_HASH = "5f920795976cb675c0236c07c3196174628f146086ec61fdbe1c16828fc78c0f591ee6956dba3123e88d988c7d9588f38f61b6af86246a08a68e28cf838bedcb"

RPROVIDES:${PN} += "/usr/bin/sed \
base-/bin/sed \
sed"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
