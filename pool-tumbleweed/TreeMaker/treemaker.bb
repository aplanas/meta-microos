SUMMARY = "Tool for the Design of Origami Bases"
DESCRIPTION = "TreeMaker is a program for the design of origami bases. You draw a stick figure \
of the base on the screen; each stick in the stick figure (the “tree”) will be \
represented by a flap on the base. You can also place various constraints on \
the flaps, forcing them to be corner, edge, or middle flaps, and/or setting up \
various symmetry relationships (forcing pairs of flaps to be symmetric about a \
line of symmetry of the paper, for example). Once you have defined the tree, \
TreeMaker computes the full crease pattern for a base which, when folded, will \
have a projection (roughly speaking, its “shadow”) equivalent to that specified \
by the defining tree. The crease pattern can be printed out, or copied and \
pasted into another graphics program for further processing."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "TreeMaker-5.0.1-1.2.aarch64.rpm"
RPM_HASH = "4aa7b345c66e3f2debe34c5e79b18883f76d501bfd08e1bf9131a7b17f0e41ce4c4a7da6d0a1563aa48a52cb5e2c8c4218e8faf13d53878fa128add47b56ba8a"

RPROVIDES:${PN} += "TreeMaker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgtk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0"

inherit rpm
