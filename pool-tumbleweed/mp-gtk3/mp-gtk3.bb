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

RPM_NAME = "mp-gtk3-5.2.13-1.27.aarch64.rpm"
RPM_HASH = "20713afdee08dc164e8383729de7ae4400d53478d8d6d7da8702d638994ef62522c311293fd504fb226e2c5f2bd0b4d2169c74b9645a6428bf253e4569e402d2"

RPROVIDES:${PN} += "mp-gtk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libncursesw.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libtinfo.so.6 \
mp"

inherit rpm
