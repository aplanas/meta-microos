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

RPM_NAME = "taskwarrior-2.6.2-1.8.aarch64.rpm"
RPM_HASH = "ee35a41a016bfdb72b36899303e09303b030eae54e91c922b619217b27a00449bfbc4e0025bed055fef2b47d3e9cc969cc430c9dc4f28c780f79cea4dc053d5d"

RPROVIDES:${PN} += "task \
taskwarrior"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libm.so.6 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
