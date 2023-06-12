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

RPROVIDES:${PN} += "anjuta anjuta(aarch-64) application() application(anjuta.desktop) libam-project.so()(64bit) libanjuta-build-basic-autotools.so()(64bit) libanjuta-class-gen.so()(64bit) libanjuta-cvs-plugin.so()(64bit) libanjuta-debug-manager.so()(64bit) libanjuta-devhelp.so()(64bit) libanjuta-document-manager.so()(64bit) libanjuta-file-wizard.so()(64bit) libanjuta-gdb.so()(64bit) libanjuta-git.so()(64bit) libanjuta-glade.so()(64bit) libanjuta-indentation-c-style.so()(64bit) libanjuta-indentation-python-style.so()(64bit) libanjuta-jhbuild.so()(64bit) libanjuta-language-cpp-java.so()(64bit) libanjuta-language-support-python.so()(64bit) libanjuta-loader.so()(64bit) libanjuta-message-view.so()(64bit) libanjuta-parser-cxx.so()(64bit) libanjuta-patch.so()(64bit) libanjuta-project-import.so()(64bit) libanjuta-project-manager.so()(64bit) libanjuta-project-wizard.so()(64bit) libanjuta-quick-open.so()(64bit) libanjuta-run-program.so()(64bit) libanjuta-snippets-manager.so()(64bit) libanjuta-sourceview.so()(64bit) libanjuta-starter.so()(64bit) libanjuta-subversion.so()(64bit) libanjuta-symbol-db.so()(64bit) libanjuta-terminal.so()(64bit) libanjuta-tools.so()(64bit) libdir-project.so()(64bit) libfile-manager.so()(64bit) libjs-support-plugin.so()(64bit) libjs_debugger.so()(64bit) liblanguage-manager.so()(64bit) libmk-project.so()(64bit) metainfo() metainfo(anjuta.appdata.xml) mimehandler(application/x-anjuta) mimehandler(application/x-anjuta-compressed-project-template) mimehandler(application/x-anjuta-project-template) mimehandler(inode/directory)"
RDEPENDS:${PN} += "/usr/bin/env autoconf autogen automake gettext ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libanjuta-3.so.0()(64bit) libapr-1.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgda-6.0.so.6.0.0()(64bit) libgda-sqlite libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgdl-3.so.5()(64bit) libgio-2.0.so.0()(64bit) libgladeui-2.so.13()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtksourceview-3.0.so.1()(64bit) libpango-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libsvn_client-1.so.0()(64bit) libsvn_subr-1.so.0()(64bit) libtool libvte-2.91.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) typelib(GLib) typelib(Gdk) typelib(GdkPixbuf) typelib(Gtk) typelib(St)"

inherit rpm
