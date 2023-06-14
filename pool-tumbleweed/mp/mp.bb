SUMMARY = "A text editor for programmers"
DESCRIPTION = "Minimum Profit \
A text editor for programmers \
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

RPM_NAME = "mp-5.2.13-1.26.aarch64.rpm"
RPM_HASH = "17a3266a381700568f39ab4393f0bc9dc25f249e7159863c1400b9fbd3cf83595c6f67885894d61eac04d2d609d3d9f9a6286bd2acb83cf99db0e4bb1cb4521c"

RPROVIDES:${PN} += "mp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
