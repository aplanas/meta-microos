SUMMARY = "Git for operating system binaries  -- GObject bindings"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.6"

RPM_NAME = "typelib-1_0-OSTree-1_0-2023.6-1.1.aarch64.rpm"
RPM_HASH = "47f203c90f40ebae3fff2bbd93abaaa521514055787880bdb47f226b8ba7f47b2dd60b659847e72d09eb7420ec997bd50053c510793017e23650ed00df300e1a"

RPROVIDES:${PN} += "typelib-1-0-OSTree-1-0 \
typelib-OSTree"

RDEPENDS:${PN} += "libostree-1.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
