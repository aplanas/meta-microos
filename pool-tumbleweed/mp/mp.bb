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

RPM_NAME = "mp-5.2.13-1.27.aarch64.rpm"
RPM_HASH = "67e38ac0f5a1e54386ff52f7ee07c8de890827961f9eba14d812760bac207cc2f7d457e904f5b28c39953ee1588f956a01e8fd51f48ee32d2874c2283fd9c1d0"

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
