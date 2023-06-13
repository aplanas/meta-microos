SUMMARY = "Command-line todo list manager"
DESCRIPTION = "It maintains a list of tasks that you want to do, allowing you to add/remove, \
and otherwise manipulate them. Task has a rich list of subcommands that allow \
you to do sophisticated things with it. You'll find it has customizable \
reports, charts, GTD features, Lua extensions, device synching and more. \
 \
Taskwarrior is a very active project involving people around the globe - check \
often for updates."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "taskwarrior-2.6.2-1.7.aarch64.rpm"
RPM_HASH = "329542d3effdf4a518f4a08444e926311626e6c01e8e08e45964b781af638b971859549361ade94481487b2f4308e285de4cb587a0d20a05d510f1545b2509db"

RPROVIDES:${PN} += "task \
taskwarrior \
taskwarrior(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
