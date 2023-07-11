SUMMARY = "Git for operating system binaries  -- GObject bindings"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "typelib-1_0-OSTree-1_0-2023.2-2.2.aarch64.rpm"
RPM_HASH = "bd12cba5382cb0820ddd6a904aeeca5b59f0f355d5305f3fac6b9e76b2ed89db9dba127b952274a9b73fae5e6b04f2b8690773fcd6e0a85973835bd70204858e"

RPROVIDES:${PN} += "typelib-1-0-OSTree-1-0 \
typelib-OSTree"

RDEPENDS:${PN} += "libostree-1.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
