SUMMARY = "A text editor for programmers (GTK+3 version)"
DESCRIPTION = "Minimum Profit \
A text editor for programmers (GTK+3 version) \
 \
Features \
 \
    * Fully scriptable using a C-like scripting language. \
    * Unlimited undo levels. \
    * Complete Unicode support. \
    * Multiple files can be edited at the same time and blocks copied and pasted among them. \
    * Syntax highlighting for many popular languages / file formats: C, C++, Perl, Shell Scripts, \
      Ruby, Php, Python, HTML... \
    * Creative use of tags: tags created by the external utility ctags are used to move \
      instantaneously to functions or variables inside your current source tree. Tags are \
      visually highlighted (underlined), and symbol completion can be triggered to avoid typing \
      your own function names over and over. \
    * Intelligent help system: pressing F1 over any word of a text being edited triggers the \
      underlying system help (calling man when editing C or Shell files, perldoc with Perl, ri \
      on Ruby, winhelp on MS Windows...). \
    * Understandable interface: drop-down menus, reasonable default key bindings. \
    * Configurable keys, menus and colors. \
    * Text templates can be easily defined / accessed. \
    * Multiplatform: Console/curses, GTK+, MS Windows. \
    * Automatic indentation, word wrapping, internal grep, learning / repeating functions. \
    * Spellchecking support (via the ispell package). \
    * Multilingual. \
    * Password-protected, encrypted text files (using the ARCFOUR algorithm). \
    * It helps you abandon vi, emacs and other six-legged freaks definitely."
LICENSE = "GPL-2.0"

PV = "5.2.13"

RPM_NAME = "mp-gtk3-5.2.13-1.26.aarch64.rpm"
RPM_HASH = "3f96d12b60d7a1eabed112779a7dc8ccd2a37ea0a3b2d5bbd50161b445db69f92ae44f84506f769edb7e819506b6cdee2dcae9116f94d55cdab633e3e1a83294"

RPROVIDES:${PN} += "application() \
application(mp-5-gtk3.desktop) \
mimehandler(text/plain) \
mp-gtk3 \
mp-gtk3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libtinfo.so.6()(64bit) \
mp"

inherit rpm
