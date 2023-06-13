SUMMARY = "VM - a mail reader for GNU Emacs"
DESCRIPTION = "VM (View Mail) is an Emacs subsystem that allows UNIX mail to be read \
and disposed of within Emacs.  Commands exist to do the normal things \
expected of a mail user agent, such as generating replies, saving \
messages to folders, deleting messages and so on.  There are other more \
advanced commands that do tasks like bursting and creating digests, \
message forwarding, and organizing message presentation according to \
various criteria."
LICENSE = "GPL-2.0+"

PV = "8.2.0b.1538"

RPM_NAME = "emacs-vm-8.2.0b.1538-1.1.aarch64.rpm"
RPM_HASH = "9ab5832ab7ac3e722a42d0766e7be6999e6696309760b7a17690efd1d5c05a6a3dc152257b8808bc1c27f342970386e5aa8d1f3285880c7569c1327c94e39a56"

RPROVIDES:${PN} += "emacs-vm \
emacs-vm(aarch-64)"

RDEPENDS:${PN} += "ed \
emacs \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
