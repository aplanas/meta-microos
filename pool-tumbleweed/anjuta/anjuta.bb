SUMMARY = "Versatile Integrated Development Environment for GNOME"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop. It features a number of advanced programming facilities \
includes project management, application wizards, an interactive \
debugger, an integrated Glade UI designer, integrated Devhelp API help, \
an integrated Valgrind memory profiler, an integrated gprof performance \
profiler, a class generator, a powerful source editor, source browsing, \
and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "anjuta-3.34.0-5.7.aarch64.rpm"
RPM_HASH = "b755e32fac416fc932897873ab5f0578f453ac8387e302e02c5db9636882a3fb5c633c74f85409ed6a9d9dab52d6842f8290ba7ab47164fce9344027ecd7519b"

RPROVIDES:${PN} += "anjuta \
libam-project.so \
libanjuta-build-basic-autotools.so \
libanjuta-class-gen.so \
libanjuta-cvs-plugin.so \
libanjuta-debug-manager.so \
libanjuta-devhelp.so \
libanjuta-document-manager.so \
libanjuta-file-wizard.so \
libanjuta-gdb.so \
libanjuta-git.so \
libanjuta-glade.so \
libanjuta-indentation-c-style.so \
libanjuta-indentation-python-style.so \
libanjuta-jhbuild.so \
libanjuta-language-cpp-java.so \
libanjuta-language-support-python.so \
libanjuta-loader.so \
libanjuta-message-view.so \
libanjuta-parser-cxx.so \
libanjuta-patch.so \
libanjuta-project-import.so \
libanjuta-project-manager.so \
libanjuta-project-wizard.so \
libanjuta-quick-open.so \
libanjuta-run-program.so \
libanjuta-snippets-manager.so \
libanjuta-sourceview.so \
libanjuta-starter.so \
libanjuta-subversion.so \
libanjuta-symbol-db.so \
libanjuta-terminal.so \
libanjuta-tools.so \
libdir-project.so \
libfile-manager.so \
libjs-debugger.so \
libjs-support-plugin.so \
liblanguage-manager.so \
libmk-project.so"

RDEPENDS:${PN} += "/usr/bin/env \
autoconf \
autogen \
automake \
gettext \
ld-linux-aarch64.so.1 \
libanjuta-3.so.0 \
libapr-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgda-6.0.so.6.0.0 \
libgda-sqlite \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgdl-3.so.5 \
libgio-2.0.so.0 \
libgladeui-2.so.13 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libpango-1.0.so.0 \
libstdc++.so.6 \
libsvn-client-1.so.0 \
libsvn-subr-1.so.0 \
libtool \
libvte-2.91.so.0 \
libxml2.so.2 \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk \
typelib-St"

inherit rpm
