SUMMARY = "a simple interface to the readline and history libraries"
DESCRIPTION = "This Lua module offers a simple calling interface to the GNU Readline/History Library. \
The function readline() is a wrapper, which invokes the GNU readline, adds the line to the end of the History List, and then returns the line. Usually you call save_history() before the program exits, so that the History List is saved to the histfile. \
Various options can be changed using the set_options{} function. \
The user can configure the GNU Readline (e.g. vi or emacs keystrokes ?) with their individual ~/.inputrc file, see the INITIALIZATION FILE section of man readline. \
By default, the GNU readline library dialogues with the user by reading from stdin and writing to stdout; this fits very badly with applications that want to use stdin and stdout to input and output data. Therefore, this Lua module dialogues with the user on the controlling-terminal of the process (typically /dev/tty) as returned by ctermid(). \
Most of readline's Alternate Interface is now included, namely   handler_install,   read_char   and handler_remove. \
Some applications need to interleave keyboard I/O with file, device, or window system I/O, typically by using a main loop to select() on various file descriptors.   To accommodate this need, readline can also be invoked as a 'callback' function from an event loop, and the Alternate Interface offers functions to do this. \
The Alternate Interface does offer tab-completion; but it does not add to the history file, so you will probably want to call RL.add_history(s) explicitly. See handler_install() \
Access to readline's Custom Completion is now provided. \
This module does not work lua -i because that runs its own readline, and the two conflict with each other."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "lua51-readline-3.0-3.2.aarch64.rpm"
RPM_HASH = "8d0b55a9b89139950b76e1d5d6d8e1a85112bbb0c88493a0c7d3a7bf693f60dc16327fbc535e2251b4a6db5986451ab4074e1565ac4af0a85d6d58ceb55dd7f3"

RPROVIDES:${PN} += "lua51-readline \
lua51-readline(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblua5.1.so.5()(64bit) \
libreadline.so.8()(64bit) \
lua51-luaposix"

inherit rpm
